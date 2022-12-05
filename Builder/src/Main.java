public class Main {
    public static void main(String[] args) {
        Entity a = new Entity.EntityBuilder("Dominik", "Tworek").age(28).enemy(true).phoneNumber(123456).story("Finally it doesn't work how i expect").build();


        System.out.println(a.getStory());
        System.out.println(a.toString());

        Canvas canvas = new Canvas.CanvasBuilder("Witaj").addAnswer("Czesc").addAnswer("Jak sie masz?").build();
        Canvas c = new Canvas.CanvasBuilder("Next example")
                .addAnswer("Answer has been added since I created this object")
                .addAnswer("Next answer showing as second line.")
                .addAnswer("Third answer also is here.")
                .build();

        canvas.toString();
        c.toString();

    }
}