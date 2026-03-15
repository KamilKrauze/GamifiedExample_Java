package Game.Core;

import Game.Mechanisms.GameClass;

@GameClass
public class Player extends BaseCharacter
    implements IController
{
    protected String name;

    protected boolean bIsCrawling = false;

    public Player()
    {
        super();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    protected void OnBegin()
    {
        super.OnBegin();
    }

    @Override
    public void MoveXY(float x, float y) {
        Location[0] = Location[0] + x;
        Location[1] = Location[1] + y;
        System.out.printf("[%s] moved by {%f, %f}\n", uuid,x,y);

    }

    @Override
    public void Jump() {
        if (bIsCrawling) {
            System.out.printf("[%s] stood up\n", uuid);
        }
        else
        {
            System.out.printf("[%s] jumped\n", uuid);
        }
    }

    @Override
    public void Crawl() {
        bIsCrawling = !bIsCrawling;
        if (bIsCrawling) {
            System.out.printf("[%s] crawling\n", uuid);
        }
        else
        {
            System.out.printf("[%s] stood up\n", uuid);
        }
    }

    @Override
    public void Attack()
    {

    }
}
