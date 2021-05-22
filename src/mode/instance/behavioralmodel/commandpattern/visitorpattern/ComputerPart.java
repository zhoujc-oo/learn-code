package mode.instance.behavioralmodel.commandpattern.visitorpattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
