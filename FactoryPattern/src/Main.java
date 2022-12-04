public class Main {
    public static void main(String[] args) {
        NYPizzaStore nyFactory = new NYPizzaStore();
        nyFactory.orderPizza("Cheese");
        nyFactory.orderTortilla("Beef");
        nyFactory.orderPizza("Pepperoni");
        nyFactory.orderTortilla("Cheese");

        System.out.println("********************************");
        ItallianPizzaStore italianFactory = new ItallianPizzaStore();
        italianFactory.orderPizza("Cheese");
        System.out.println("********************************");

        italianFactory.orderPizza("MeatFest");
        System.out.println("********************************");

        italianFactory.orderTortilla("Beef");



    }
}