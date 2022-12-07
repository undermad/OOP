public class MilkDecorator extends Drink{
    Drink drink;

    public MilkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return drink.cost() + 0.30;
    }
}
