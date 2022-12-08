public enum SingletonEnum {
    //MUCH SIMPLER AND BETTER WAY TO CREATE SINGLETON
    //THINK 3 TIMES BEFORE YOU CREATE SINGLETON, MAYBE IN FUTURE WHEN YOUR APP GROW
    //AND YOU WANT TO ADD ANOTHER INSTANCE

    INSTANCE;

    public void doSomething(String string){
        System.out.println("Hello enum singleton!");
    }

}
