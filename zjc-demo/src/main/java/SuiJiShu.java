public class SuiJiShu {
    public static void main(String[] args) {
       /* double randNum=0;
        while (randNum<0.5){
            randNum=Math.random();//Math.random()随机生成一个数范围为【0.1）
            System.out.println(randNum);
        }
        //if(randNum>0.5){
            System.out.println("生成一个大于0.5的随机数："+randNum);
        //}*/
        int zhou = 30;
        int jia = 90;
        int cheng = jia - zhou;
        if(cheng<=1){
            System.out.println("非法数字范围：（"+zhou+","+jia+")");
        }
         for(int i = 0;i < 50;i++){
            int zhi = (int) (Math.random() * jia * 100);
            int gang = (zhi % cheng) + zhou;
           if(gang<=zhou){
                gang = zhou+1;
            }else if(gang > jia) {
               gang = jia - 1;
               System.out.println("cheng=" + cheng + ",gang=" + gang);
           }
        }
    }
}
