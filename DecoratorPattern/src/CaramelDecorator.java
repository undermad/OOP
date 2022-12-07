public class CaramelDecorator extends Drink{
    Drink drink;

    public CaramelDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return this.drink.cost() + 0.40;
    }
}
