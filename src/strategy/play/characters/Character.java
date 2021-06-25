package strategy.play.characters;

import strategy.play.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
