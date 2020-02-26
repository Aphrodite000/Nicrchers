import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 验证尼科彻斯定理 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNextInt()){
            int pop=input.nextInt();
            String str=GetSequeOddNum(pop);
            System.out.println(str);
        }
    }

    /**
     * 1的三次方=1;
     * 2:3+5;  2*2-2+1=3
     * 3:7+9+11;   3*3-3+1=7
     * 4:13+15+17+19
     * @param m
     * @return
     */
    private static String GetSequeOddNum(int m) {
        //等差数列首项
        int a1=m*m-m+1;
        StringBuilder sb=new StringBuilder();
        sb.append(a1);
        sb.append("+");
        for(int i=0;i<=m-2;i++){
            if(i==m-2){
                a1+=2;
                sb.append(a1);
            }else{
            a1+=2;
            sb.append(a1);
            sb.append("+");
            }
        }
        String s=sb.toString();
        return s;
    }
}
