package mode.instance.creationmode.factory.singletonpattern;

public class SingObject {
    private static SingObject instance = new SingObject();

    private SingObject(){
        System.out.println("zhou");
    }

    public static SingObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Holle Worle!!!");
    }
}
