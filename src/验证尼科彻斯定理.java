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

    private static String GetSequeOddNum(int m) {
        StringBuilder str=new StringBuilder();
        int nums=(int)Math.pow(m,3);
        Queue<Integer> queue=new LinkedList<>();
        int sums=0;
        int i=0;
        for(i=1;i<1000000;i+=2){
            queue.offer(i);
            if(queue.size()>m){
                sums-=queue.poll();
            }
            sums+=i;
            if(sums==sums){
                break;
            }
        }
        if(i<1000000){
            while (!queue.isEmpty()){
                str.append(queue.poll());
                if(!queue.isEmpty()){
                    str.append("+");
                }
            }
        }
        return str.toString();
    }
}
