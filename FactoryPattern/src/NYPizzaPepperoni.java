public class NYPizzaPepperoni extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing NYStylePepperoni pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Baking NYStylePepperoni pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cuuting NYStylePepperoni pizza.");
    }

    @Override
    public void box() {
        System.out.println("Boxing NYStylePepperoni pizza.");
    }
}
