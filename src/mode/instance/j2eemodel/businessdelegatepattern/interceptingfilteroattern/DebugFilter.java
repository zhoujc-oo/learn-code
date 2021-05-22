package mode.instance.j2eemodel.businessdelegatepattern.interceptingfilteroattern;

public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
