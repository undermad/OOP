public class Main {
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.doSomething("Hello enum singleton!");



        Singleton.getInstance().printSomething("Hello Singleton!");
    }
}