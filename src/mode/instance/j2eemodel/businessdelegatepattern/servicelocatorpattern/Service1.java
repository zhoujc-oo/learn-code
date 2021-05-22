package mode.instance.j2eemodel.businessdelegatepattern.servicelocatorpattern;

public class Service1 implements Service {
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
