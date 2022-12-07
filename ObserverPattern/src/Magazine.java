import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Magazine implements Observable {
    private final List<Observer> observers;

    public Magazine() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(this);
        });
    }

    @Override
    public String getObservableObjectName() {
        return "Magazine";
    }
}
