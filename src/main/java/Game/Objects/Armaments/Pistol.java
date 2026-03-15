package Game.Objects.Armaments;

import Game.Core.GameObject;

public class Pistol extends WeaponBase
{
    public Pistol(GameObject owner)
    {
        super(owner);
        damage = 15;
    }

    @Override
    public void Use()
    {
        System.out.println("Pew, pew!");
        System.out.printf("Did %d damage to something.\n", damage);
    }
}
