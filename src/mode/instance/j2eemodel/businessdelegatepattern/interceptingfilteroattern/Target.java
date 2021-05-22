package mode.instance.j2eemodel.businessdelegatepattern.interceptingfilteroattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}