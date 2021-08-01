package cn.zjc.OO;

public class StyInterface {
        public static void main(String[] args) {
            // 创建一个类，分别调用eat,work方法
            Achieveman achieveman = new Achieveman();
            achieveman.eat();
            achieveman.work();
        }
    }
    // 定义一个man接口
    interface man{
        // 抽象方法
        public void eat();
        public void work();
    }
    class Achieveman implements man {
        // 继承接口后,接口内的方法必须的全部实现
        public void eat() {
            System.out.println("男人吃饭");
        }
        public void work() {
            System.out.println("男人工作");
        }
    }


