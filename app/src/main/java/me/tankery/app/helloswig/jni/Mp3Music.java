/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package me.tankery.app.helloswig.jni;

public class Mp3Music extends Music {
  private long swigCPtr;

  protected Mp3Music(long cPtr, boolean cMemoryOwn) {
    super(music_wrapJNI.Mp3Music_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Mp3Music obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        music_wrapJNI.delete_Mp3Music(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Mp3Music() {
    this(music_wrapJNI.new_Mp3Music(), true);
  }

}
