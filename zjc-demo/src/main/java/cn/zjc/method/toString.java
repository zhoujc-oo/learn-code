package cn.zjc.method;

public class toString {
    public static class Main{
        public static void main(String[] argv){
            MyClass obj  = new MyClass(123);
            String objStr = obj.toString();
            System.out.println(objStr);
        }
    }
    static class MyClass {
        private int value;

        public MyClass(int value) {
            this.value = value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

       //重写类的toString
        public String toString() {
            // Return the stored value as a string
            String str = String.valueOf(this.value);
            return str;
        }
    }


}
