package cn.zjc.method;

public class clone {
    static class MyClass implements Cloneable {
        private double value;
        public MyClass(double value) {
            this.value = value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public double getValue() {
            return this.value;
        }

        public Object clone() {
            MyClass copy = null;
            try {
                copy = (MyClass) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return copy;
        }
    }

    public static class Main {
        public static void main(String[] args) {
            MyClass dh = new MyClass(100.00);

            MyClass dhClone = (MyClass) dh.clone();

            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());

            dh.setValue(100.00);
            dhClone.setValue(200.00);

            System.out.println("Original:" + dh.getValue());
            System.out.println("Clone :" + dhClone.getValue());
        }
    }


}
