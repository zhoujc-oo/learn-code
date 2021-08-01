package cn.zjc.test.animal;

    enum Color
    {
        ZHOU, JIA, CHENG;
    }
    public class test9{
        public  void main(String[] args) {
            for (Color myVar : Color.values()){
                System.out.println(myVar);
            } }
    }

