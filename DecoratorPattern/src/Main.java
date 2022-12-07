public class Main {
    public static void main(String[] args) {
        Drink coffee = new Coffee();
        MilkDecorator coffeeWithMilk = new MilkDecorator(coffee);
        CaramelDecorator coffeeWithMilkAndCaramel = new CaramelDecorator(coffeeWithMilk);

        System.out.println(coffeeWithMilkAndCaramel.cost());

    }
}