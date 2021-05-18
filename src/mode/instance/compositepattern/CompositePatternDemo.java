package mode.instance.compositepattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO",30000);

        Employee headSales = new Employee("Rober","head Sales",20000);

        Employee headMarketing = new Employee("Michel","Head Marketing",20000);

        Employee cleak1 = new Employee("Laura","Marketing",10000);
        Employee cleak2 = new Employee("Rob","Sales",10000);

        Employee salesExecutive1 = new Employee("Richard","Salas",10000);
        Employee salesExecutive2 = new Employee("Rob","Sales",10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(cleak1);
        headMarketing.add(cleak2);

        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
        }
        for (Employee employee : headMarketing.getSubordinates()){
            System.out.println(employee);
        }
    }
}
