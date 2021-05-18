public class ChengFaKouJiuBiao {
    public static void main(String[] args) {
        //循环语句for
        for(int i = 1;i<=9;i++){
            String Line = "";
            for(int j = 1;j<=9;j++){
                if(j>i){
                    break;
                }
                Line += j +"*" +i+"="+(i*j)+"\t";
            }
            System.out.println(Line);

        }

    }
}




