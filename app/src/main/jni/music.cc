#include "music.h"

int Music::fileCount = 0;

float Mp3Music::getTime(LengthGetter* lg) {
    return lg->get() / 100.0f;
}

float WavMusic::getTime(LengthGetter* lg) {
    return lg->get() / 50.0f;
}
