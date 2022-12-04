public class Main {
    public static void main(String[] args) {
        Entity a = new Entity.EntityBuilder("Dominik", "Tworek").age(28).enemy(true).phoneNumber(123456).story("Finally it doesn't work how i expect").build();


        System.out.println(a.getStory());
        System.out.println(a.toString());





    }
}