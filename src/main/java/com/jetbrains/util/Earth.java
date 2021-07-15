package com.jetbrains.util;

class Earth {

    enum SingleUsePlastic {
        STRAW, CUP, BOTTLE, SPOON;
    }

    // Template
/*
    int getDamageToPlanet(SingleUsePlastic plastic) {
        var damage = 0;
        switch (plastic) {
            case BOTTLE:
                damage = 10;
                break;
            case CUP:
                damage = 11;
                break;
            case STRAW:
                damage = 1;
                break;
            default:
                damage = 100;
        }
        return damage;
    }
*/
    int getAverageTempIncreasePlanet(Season season) {
        int tempRise = 0;
        switch (season) {
            case SUMMER:
                tempRise = 10;
                break;
            case WINTER:
                tempRise = 11;
                break;
            case SPRING, MONSOON, AUTUMN:
                tempRise = 1;
                break;
        }
        return tempRise;
    }
    enum Season {SPRING, SUMMER, MONSOON, AUTUMN, WINTER}

}
