public class ItalianPizzaCheese extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing ItalianStyleCheese pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking ItalianStyleCheese pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cuuting ItalianStyleCheese pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing ItalianStyleCheese pizza.");
    }
}
