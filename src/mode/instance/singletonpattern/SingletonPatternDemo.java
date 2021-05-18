package mode.instance.singletonpattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingObject object = SingObject.getInstance();

        object.showMessage();

    }
}
