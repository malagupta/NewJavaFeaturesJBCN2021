package com.jetbrains.sealedtypes.plants;

public sealed class Plant permits Climber, Herb, Shrub {
    public static void main(String[] args) {
        int permits = 10;

    }
}