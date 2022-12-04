public class ItalianPizzaMeatFest extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing ItalianPizzaMeatFest.");
    }

    @Override
    public void bake() {
        System.out.println("Baking ItalianPizzaMeatFest");

    }

    @Override
    public void cut() {
        System.out.println("Cutting ItalianPizzaMeatFest");
    }

    @Override
    public void box() {
        System.out.println("Boxing ItalianPizzaMeatFest");
    }
}
