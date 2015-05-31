

class LengthGetter {
public:
    virtual ~LengthGetter() {}
    virtual long get() = 0;
};


class Music {

private:

    LengthGetter* lengthGetter;

public:
    Music() {
        fileCount++;
    }
    virtual ~Music() {
        fileCount--;
    };
    virtual float getTime(LengthGetter*) = 0;

    static  int fileCount;
};

class Mp3Music : public Music {
    virtual float getTime(LengthGetter*);
};

class WavMusic : public Music {
public:
    virtual float getTime(LengthGetter*);
};