import java.awt.image.BufferedImage;
import java.nio.file.Path;

public class Entity {
    private String name; // required
    private String surname; // required

    private int age; // optional
    private Path outfit; // optional
    private int phoneNumber; // optional
    private boolean enemy; // optional
    private String story;

    private Entity (EntityBuilder builder){
        this.name = builder.name;
        this.surname = builder.name;
        this.age = builder.age;
        this.outfit = builder.outfit;
        this.phoneNumber = builder.phoneNumber;
        this.enemy = builder.enemy;
        this.story = builder.story;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Path getOutfit() {
        return outfit;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isEnemy() {
        return enemy;
    }

    public String getStory() {
        return story;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Surname: " + this.surname + "\n" +
                "Age: " + this.age + "\n" +
                "OutfitPath: " + this.outfit + "\n" +
                "Phone Number: " + this.phoneNumber + "\n" +
                "Enemy: " + this.enemy;
    }

    public static class EntityBuilder {
        private final String name; // required
        private final String surname; // required

        private int age; // optional
        private Path outfit; // optional
        private int phoneNumber; // optional
        private boolean enemy; // optional
        private String story;

        public EntityBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
            this.age = 0;
            this.outfit = null;
            this.phoneNumber = 123456;
            this.enemy = false;
            this.story = "";
        }
        public EntityBuilder story(String story){
            this.story += story;
            return this;
        }

        public EntityBuilder age(int age){
            this.age = age;
            return this;
        }
        public EntityBuilder outfit(Path outfit) {
            this.outfit = outfit;
            return this;
        }
        public EntityBuilder phoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }
        public EntityBuilder enemy(boolean enemy){
            this.enemy = enemy;
            return this;
        }

        public Entity build(){
            Entity entity = new Entity(this);
            return entity;
        }

    }
}
