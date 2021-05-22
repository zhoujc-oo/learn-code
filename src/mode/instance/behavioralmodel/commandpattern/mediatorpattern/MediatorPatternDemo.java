package mode.instance.behavioralmodel.commandpattern.mediatorpattern;

public class MediatorPatternDemo {
    public static void main(String[] args){
        User robert = new User("Robert");

        User john = new User("John");

        robert.senMessage("Hi!John");
        john.senMessage("Hello! Robert");
    }
}
