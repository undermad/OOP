public abstract class Person implements Observer {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update() {
        System.out.println(this.name + " age " + this.age + " updating!");
    }
}
