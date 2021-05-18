package cn.zjc.clone;

public class ShallowClone {
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

    //static class ShallowClone implements Cloneable {
        private MyClass holder = new MyClass(0.0);

        public ShallowClone(double value) {
            this.holder.setValue(value);
        }

        public void setValue(double value) {
            this.holder.setValue(value);
        }

        public double getValue() {
            return this.holder.getValue();
        }

        public Object clone() {
            ShallowClone copy = null;
            try {
                copy = (ShallowClone) super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return copy;
        }


    //public static class Main {
        public static void main(String[] args) {
            ShallowClone sc = new ShallowClone(100.00);
            ShallowClone scClone = (ShallowClone) sc.clone();

            System.out.println("Original:" + sc.getValue());
            System.out.println("Clone :" + scClone.getValue());

            sc.setValue(200.00);

            System.out.println("Original:" + sc.getValue());
            System.out.println("Clone :" + scClone.getValue());
        }
    }



