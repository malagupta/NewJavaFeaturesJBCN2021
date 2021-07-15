package com.jetbrains.sealedtypes;

interface Erasable {}

sealed class WritingDevice permits Pen, Pencil {}

final class Pencil extends WritingDevice {}

sealed class Pen extends WritingDevice permits Marker {}

final class Marker extends Pen {}

class UseWritingDevice {
    static void write(WritingDevice pen) {
        /*
        if (pen instanceof Erasable) {
        }
        CharSequence charSequence = ((CharSequence) pen);
        */
    }
}



