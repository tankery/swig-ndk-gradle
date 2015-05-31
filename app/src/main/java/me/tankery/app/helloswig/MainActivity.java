package me.tankery.app.helloswig;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import me.tankery.app.helloswig.jni.LengthGetter;
import me.tankery.app.helloswig.jni.Mp3Music;
import me.tankery.app.helloswig.jni.Music;
import me.tankery.app.helloswig.jni.WavMusic;
import me.tankery.app.helloswig.jni.hello;


public class MainActivity extends Activity {

    static {
        System.loadLibrary("hello");
    }

    @InjectView(R.id.text_hello)
    TextView textHello;
    @InjectView(R.id.edit_length)
    EditText editLength;
    @InjectView(R.id.text_mp3_time)
    TextView textMp3Time;
    @InjectView(R.id.text_wav_time)
    TextView textWavTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        changeText();
    }

    @OnClick(R.id.btn_submit)
    void submit() {
        int length = Integer.parseInt(editLength.getText().toString());
        textMp3Time.setText(String.valueOf(getMp3MusicTime(length)));
        textWavTime.setText(String.valueOf(getWavMusicTime(length)));
    }

    private void changeText() {
        String text = getNativeString();
        if (text.isEmpty())
            text = "hello Java";
        textHello.setText(text);
    }

    private String getNativeString() {
        return hello.get_hello();
    }

    private float getMp3MusicTime(final int length) {
        Music music = new Mp3Music();
        return music.getTime(new LengthGetter() {
            @Override
            public int get() {
                return length;
            }
        });
    }

    private float getWavMusicTime(final int length) {
        Music music = new WavMusic();
        return music.getTime(new LengthGetter() {
            @Override
            public int get() {
                return length;
            }
        });
    }

}
