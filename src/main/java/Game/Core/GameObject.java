package Game.Core;

import java.util.UUID;

public class GameObject implements IObject {
    protected String uuid;

    public GameObject() {
        uuid = UUID.randomUUID().toString();
    }

    @Override
    final public String getUUID() {
        return uuid;
    }

    @Override
    final public void setUUID(String newUUID) {
        uuid = newUUID;
    }
}
