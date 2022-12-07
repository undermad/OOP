public class Coffee extends Drink{
    public Coffee() {
        this.price = 2.99;
    }

    @Override
    public double cost() {
        return this.price;
    }
}
