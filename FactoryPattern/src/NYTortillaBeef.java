public class NYTortillaBeef extends Tortilla{
    @Override
    public void prepare() {
        System.out.println("Preparing NYStyleTortillaBeef");
    }

    @Override
    public void fill() {
        System.out.println("Filling NYStyleTortillaBeef");
    }

    @Override
    public void roll() {
        System.out.println("Rolling NYStyleTortillaBeef");
    }

    @Override
    public void box() {
        System.out.println("Boxing NYStyleTortillaBeef");
    }
}
