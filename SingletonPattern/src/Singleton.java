public class Singleton {

    // THIS IS OLD APPROACH AND IS THREAD UNSAFE
    // "Singletons is that they are no longer Singleton once you implement a serializable
    // interface because the method readObject() always returns a new instance just like the Java constructor."
    // BEST WAY TO APPLY SINGLE TON IS TO USE ENUM
    // THERE IS SOME CONSIDERATION THAT WE SHOULDN'T USE SINGLETON PATTERN BECAUSE MAYBE IN FUTURE WE WANT TO CREATe
    // SECOND OBJECT.

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


    public void printSomething(String string){
        System.out.println(string);
    }
}
