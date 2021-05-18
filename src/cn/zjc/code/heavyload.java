package cn.zjc.code;

/**
 *  xianxichongzai
 * @author zhoujc
 * @date 2021……
 */
public class heavyload {

    class Hello{
        //一个简单的重载实例

        /**
         * javadoc
         */
        public void hello(){
            System.out.println("Hello,world");
        }

        public void hello(String name){
            System.out.println("hello" + name +"!");
        }

        /**
         *
         * @param name
         * @param age
         */
        public void hello(String name,int age){
            // todo zmgai
            if(age < 18){
                System.out.println("Hi" + name);
            }else{
                System.out.println("Hello," + name + "!");
            }
        }
    }
}
