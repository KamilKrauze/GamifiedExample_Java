package Game.Core;
import Game.Mechanisms.GameClass;

public class BaseCharacter extends GameObject
        implements IObject
{
    public float[] Location = new float[3];
    public float[] Velocity = new float[3];

    public BaseCharacter()
    {
        super();
        if (this.getClass().isAnnotationPresent(GameClass.class)) { OnBegin(); }
    }

    protected void OnBegin() {}
}
