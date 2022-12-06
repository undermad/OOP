public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        American american = new American("Smith", 32);
        American american1 = new American("Bush", 58);
        magazine.addObserver(american);
        magazine.addObserver(american1);

        magazine.notifyObservers();
    }
}