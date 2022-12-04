public class ItallianPizzaStore extends PizzaStore{
    @Override
    protected Tortilla createTortilla(String type) {
        if (type == "Beef")
            return new ItalianTortillaBeef();
        return null;
    }

    @Override
    protected Pizza createPizza(String type) {
        if (type == "Cheese")
            return new ItalianPizzaCheese();
        if (type == "MeatFest")
            return new ItalianPizzaMeatFest();
        return null;

    }
}
