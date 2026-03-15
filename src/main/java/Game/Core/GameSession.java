package Game.Core;
import Game.Data.Internal.SessionEndReason;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

final public class GameSession
{
    private List<IObject> objectList;

    public GameSession() {
        objectList = new ArrayList<>();
    }

    public void Initialize()
    {
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        var p = new Player(); p.setUUID("Player");
        objectList.add(p);
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());
        objectList.add(new BaseCharacter());

    }

    public SessionEndReason Run()
    {
        IObject playerObj = null;
        while (true)
        {
            if (objectList == null || objectList.isEmpty())
            {
                break;
            }
            try
            {
                for (IObject obj : objectList)
                {
                    if (obj.getUUID().equals("Player")) {
                        playerObj = obj;
                    }


                }
                if (playerObj != null)
                {
                    IController p = (IController) playerObj;
                    p.Jump();
                }
                sleep(1500);
            }
            catch (Exception e)
            {
                return SessionEndReason.ExceptionThrown;
            }
        }
        return SessionEndReason.SessionEnded;
    }

}
