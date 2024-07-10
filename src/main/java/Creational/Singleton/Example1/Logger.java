package Creational.Singleton.Example1;

public class Logger {
    public static Logger logger;

    public static int counter = 0;

    public int value ;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private Logger(){

    }

    public static Logger getLogger(){
        if(counter == 0 ){
            logger = new Logger();
        }
        counter++;
        return logger;
    }

}
