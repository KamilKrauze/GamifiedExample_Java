package Game.Objects.Armaments;

import Game.Core.GameObject;

public class Waraxe extends WeaponBase
{
    public Waraxe(GameObject owner)
    {
        super(owner);
        damage = 45;
    }

    @Override
    public void Use() {
        String id = owner != null ? owner.getUUID() : "null";
        System.out.printf("[%s] swung a big ol' axe in all directions hitting anything in its path.\n", uuid);
    }


}
