package cn.zjc.abstractclass;

public abstract class Employee {

    private String name;
    private String address;
    private int number;
    public Employee(String name,String address, int number){

        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;

    }
    public double computPay(){
        System.out.println("Inside Employee computPay");
        return 0.0;
    }
    public void mailChek(){
        System.out.println("Mailing a check to" + this.name + " " + this.address);
    }
    public String toString(){
        return  name + " " + address + " " + number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public int getNuber(){
        return number;
    }

}


