package com.jetbrains.patternmatching.switchconstr;

/**
 * <div style="font-size: 110%;">Pattern matching for switch constructs</div>
 * <ul>
 * <li>Issues with existing options</li>
 * <li>Scope of pattern variables</li>
 * <li>Handling null</li>
 * <li>Guarded patterns</li>
 * <li>Exhaustive handling</li>
 * </ul>
 */

public class MyEarth {

    int getDamage(Object obj) {
        int damage = 0;
        if (obj instanceof final Pollution pollution) {
            damage = pollution.getDamage();
        }
        else if (obj instanceof final Discrimination discrimination) {
            damage = discrimination.getDamageWhenDiscriminated();
        }
        else if (obj instanceof Deforestation deforestation) {
            damage = deforestation.getTreeDamage();
        }
        return damage;
    }

/*
    int getDamageUsingSwitch(Object obj) {
        return switch(obj) {
            case null -> -1;
            case Pollution pollution && pollution.getAQI() > 99 -> pollution.getDamage();
            case Discrimination discrimination -> discrimination.getDamageWhenDiscriminated();
            case Deforestation deforestation -> deforestation.getTreeDamage();
            default -> 0;
        };
    }
*/

    public static void main(String[] args) {
        final var myEarth = new MyEarth();
/*
        System.out.println(myEarth.getDamageUsingSwitch(new Deforestation()));
        System.out.println(myEarth.getDamageUsingSwitch(new Pollution()));
        System.out.println(myEarth.getDamageUsingSwitch(null));
*/
    }
}

