public interface Observer {
    void update(Observable observable);
    default void subscribe(Observable observable){
        observable.addObserver(this);
    }
    default void unsubscribe(Observable observable){
        observable.removeObserver(this);
    }
}
