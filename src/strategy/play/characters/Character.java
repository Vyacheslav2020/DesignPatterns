package strategy.play.characters;

import strategy.play.behaviors.WeaponBehavior;

public class Character {
    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
