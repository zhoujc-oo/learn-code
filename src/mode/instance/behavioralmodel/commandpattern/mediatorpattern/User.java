package mode.instance.behavioralmodel.commandpattern.mediatorpattern;

public class User {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public User(String name){
        this.name = name;
    }

    public void senMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
