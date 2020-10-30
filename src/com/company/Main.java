package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        Weapon weapon = new Weapon();
        weapon.setName("ar-15");
        weapon.setType("Long fire");

        boss.setHealth(700);
        boss.setDamage(70);
        boss.setSuperAblity("Ultra");
        boss.setWeapon(weapon);
        System.out.println("Health:" + boss.getHealth() + "\n" + "Damage: " + boss.getDamage() + "\n" + "SuperAbility:" + boss.getSuperAblity() + "\n" + "Weapon name: " + boss.getWeapon().getName());

    }
}
