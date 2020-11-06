package com.company;

public class Magic extends Hero {


    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Magic применил суперспособность "  + superAbilityType);
    }
}
