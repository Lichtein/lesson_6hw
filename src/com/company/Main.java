package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setHealth(700);
        medic.setDamage(70);

        Magic magic = new Magic();
        magic.setHealth(700);
        magic.setDamage(70);

        Warrior warrior = new Warrior();
        warrior.setHealth(700);
        warrior.setDamage(70);

        Hero[] heroes = new Hero[]{magic, warrior, medic};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("CRITICAL DAMAGE");

        }
    }
}
