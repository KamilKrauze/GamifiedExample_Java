package Game.Objects;

import Game.Core.IObject;

public interface IInteractable
{
    /**
     * Interaction layer method
     * @param instigator Reference to object that triggered the interaction
     */
    boolean interactWith(IObject instigator);
}
