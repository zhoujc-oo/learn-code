package cn.zjc.javaclass;

public class Weekday1 {

    public int dayValue;

    public static void main(String[] args) {
            Weekday day = Weekday.SUN;
            if (day == Weekday.SAT || day == Weekday.SUN) {
                System.out.println("Work at home!");
            } else {
                System.out.println("Work at office!");
            }
        }
    }

    enum Weekday3 {
        SUN, MON, TUE, WED, THU, FRI, SAT;
    }


