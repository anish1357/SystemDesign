package Creational.Singleton.Example1;


public class Runner {

    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        logger1.setValue(11);
        Logger logger2 = Logger.getLogger();
        System.out.println(logger2.getValue());


    }
}
