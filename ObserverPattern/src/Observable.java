public interface Observable {
    void notifyObservers();
    String getObservableObjectName();
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
}
