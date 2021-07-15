package com.jetbrains.switchexpressions;

public class Planet {
    static final int DAMAGE_CUP = 100;
    static final int DAMAGE_STRAW = 200;
    static final int DAMAGE_BOTTLE = 300;

    enum SingleUsePlastic {
        CUP, STRAW, BOTTLE
    }

    int getDamageToPlanet(SingleUsePlastic plastic) {
        var damage = -1;
        switch (plastic) {
            case CUP:
                damage = DAMAGE_CUP;
                break;
            case STRAW:
                damage = DAMAGE_STRAW;
                break;
            case BOTTLE:
                damage = DAMAGE_BOTTLE;
                break;
        }
        return damage;
    }

}
