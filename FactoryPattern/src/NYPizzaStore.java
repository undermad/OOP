public class NYPizzaStore extends PizzaStore{
    @Override
    protected Tortilla createTortilla(String type) {
        if (type == "Cheese")
            return new NYTortillaCheese();
        if(type == "Beef")
            return new NYTortillaBeef();
        return null;
    }

    @Override
    protected Pizza createPizza(String type) {
        if(type == "Cheese")
            return new NYPizzaCheese();
        if(type == "Pepperoni")
            return new NYPizzaPepperoni();
        return null;
    }
}
