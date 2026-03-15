package Game.Objects.Armaments;

import Game.Core.GameObject;

public abstract class WeaponBase extends GameObject
{
    protected GameObject owner = null;
    protected int damage = 0;

    public WeaponBase(GameObject owner)
    {
        super();
        this.owner = owner;
    }

    /**
     * Represents attacking/shooting. As it could be a gun or sword when extended.
     */
    abstract public void Use();
}
