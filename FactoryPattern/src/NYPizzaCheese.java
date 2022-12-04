public class NYPizzaCheese extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing NYStyleCheese pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NYStyleCheese pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cuuting NYStyleCheese pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing NYStyleCheese pizza.");
    }
}
