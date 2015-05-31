/* File : music.i */
%module(directors="1") music_wrap;
%feature("director") LengthGetter;

%{
#include "music.h"
%}

/* Let's just grab the original header file here */
%include "music.h"
