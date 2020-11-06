package com.company;

public class Medic extends Hero {
    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Medic применил суперспособность " + superAbilityType);
    }

}
