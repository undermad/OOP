public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("CD PROJECT RED");
        American american = new American("Smith", 32);
        American american1 = new American("Bush", 58);
        magazine.addObserver(american);
        magazine.addObserver(american1);
        Magazine magazine2 = new Magazine("BLIZZARD");

        magazine2.addObserver(american);
        magazine2.addObserver(american1);

        american.unsubscribe(magazine);
        american1.unsubscribe(magazine2);


        //this should  mainly happen in observable class
        magazine.notifyObservers();
        magazine2.notifyObservers();
    }
}