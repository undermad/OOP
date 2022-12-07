public interface Observer {
    void update(Observable observable);
    void subscribe(Observable observable);
    void unsubscribe(Observable observable);
}
