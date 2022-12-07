public interface Observable {
    void notifyObservers();
    String getObservableObjectName();
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
}
