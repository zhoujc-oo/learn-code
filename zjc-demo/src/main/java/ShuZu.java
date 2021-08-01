public class ShuZu {
    public static void main(String[] args) {
        int[] zhou = new int[10];
        System.out.println(zhou[8]);//数组的索引是重0开始的所以如果int 【为9】对应的数组为8
        System.out.println(zhou[7]);

        double[] jia = new double[32];

        System.out.println(jia[6]);
        System.out.println(jia[20]);
        int YuWen = 0;
        int i = 1;
        //......创建前必须声明名称
        String[] chengji = new String[2];
        chengji[YuWen] = "语文";
        chengji[i] = "数学";
        System.out.println("length：" + chengji[i]);
        //......

        //多维数组
        int YunWen = 40;
        int ShuXun = 60;
        double[][] DuoWei = new double[YunWen][ShuXun];
        //连续两个fou一起是不能同时用两个i
//        for (int i = 0; i<YunWen;i++){
//            for (int j =0;j<ShuXue;j++){
//                DuoWei[i][j] = 80 + Math.random()*20;
//            }
//        }

        int size = 10;
        double[] myList = new double[size];
        myList[0] = 2.3;
        myList[1] = 2.6;

        System.out.println(myList[0]);

        double [] myList1 = {1,2,3,4,5,5,};
        myList1[1] = 2.3;
        System.out.println(myList1.length);
    }
}
