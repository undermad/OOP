public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    public Tortilla orderTortilla(String type){
        Tortilla tortilla = createTortilla(type);

        tortilla.prepare();
        tortilla.fill();
        tortilla.roll();
        tortilla.box();

        return tortilla;
    }

    protected abstract Tortilla createTortilla(String type);

    protected abstract Pizza createPizza(String type);
}
