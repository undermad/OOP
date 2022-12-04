import java.nio.file.Path;

public abstract class Monster {
    private int health;
    private int dmg;

    private int def;
    private Path outfit;
    private int speed;

    public abstract void draw();
    public abstract void update();


}
