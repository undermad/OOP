public abstract class Person implements Observer {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(Observable observable) {
        System.out.println(this.name + " age " + this.age + " updating from " + observable.getObservableObjectName());
    }

//    @Override
//    public void subscribe(Observable observable){
//        observable.addObserver(this);
//    }

//    @Override
//    public void unsubscribe(Observable observable) {
//        observable.removeObserver(this);
//    }
}
