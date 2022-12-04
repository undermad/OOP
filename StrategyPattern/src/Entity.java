import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Entity {
    private int worldX;
    private int worldY;
    private ArrayList<BufferedImage> animationFrames;
    private boolean collision;
    private EntityBehavior entityBehavior;

    public Entity(EntityBehavior entityBehavior) {
        this.entityBehavior = entityBehavior;

        //example only
        this.worldX = 0;
        this.worldY = 0;
        this.animationFrames = new ArrayList<>();
        this.collision = false;
    }

    public void performBehavior(){
        entityBehavior.behave();
    }

    public void setEntityBehavior(EntityBehavior entityBehavior) {
        this.entityBehavior = entityBehavior;
    }
}
