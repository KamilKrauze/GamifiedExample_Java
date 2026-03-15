package Game.Core;

/// Player character controlling interface
public interface IController
{
    void MoveXY(float x, float y);
    void Jump();
    void Crawl();

    void Attack();
}
