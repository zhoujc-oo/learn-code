package mode.instance.j2eemodel.businessdelegatepattern;

public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
