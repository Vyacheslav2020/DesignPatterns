package strategy.play.characters;

import strategy.play.behaviors.KnifeBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
}
