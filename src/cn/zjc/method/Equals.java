package cn.zjc.method;

public class Equals {
    static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object otherObject) {
            // 判断是否一样或相等
            if (this == otherObject) {
                return true;
            }

            // 判断otherObject是否为空引用
            if (otherObject == null) {
                return false;
            }

            //是否属于同一个类
            if (this.getClass() != otherObject.getClass()) {
                return false;
            }

            // 获取SmartPoint变量中otherObject的引用
            Point otherPoint = (Point) otherObject;

            // 是否有相同的坐标x,y
            boolean isSamePoint = (this.x == otherPoint.x && this.y == otherPoint.y);

            return isSamePoint;
        }
        public int hashCode() {
            return (this.x + this.y);
        }
    }

    public static class Main {
        public static void main(String[] args) {
            Point pt1 = new Point(10, 10);
            Point pt2 = new Point(10, 10);
            Point pt3 = new Point(12, 19);
            Point pt4 = pt1;

            System.out.println("pt1 == pt1: " + (pt1 == pt1));
            System.out.println("pt1.equals(pt1): " + pt1.equals(pt1));

            System.out.println("pt1 == pt2: " + (pt1 == pt2));
            System.out.println("pt1.equals(pt2): " + pt1.equals(pt2));

            System.out.println("pt1 == pt3: " + (pt1 == pt3));
            System.out.println("pt1.equals(pt3): " + pt1.equals(pt3));

            System.out.println("pt1 == pt4: " + (pt1 == pt4));
            System.out.println("pt1.equals(pt4): " + pt1.equals(pt4));
        }
    }


}
