import java.util.*;
public class Main {
    private static void swap(int b[],int i, int i1) {
        int temp=0;
        temp=b[i];
        b[i]=b[i1];
        b[i1]=temp;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String[] a=s.split(" ");
        int[] c=new int[10];
        for(int i=0;i<10;i++){
            c[i]=Integer.parseInt(a[i]);
        }
        Map<Integer,Integer> map=new HashMap<>();
        int add=0;
        for(int i=0;i<10;i++){
            if(c[i]!=0){
                map.put(i,c[i]);
                //K为数字，V为数字个数
            }
            add+=c[i];
        }
        int[] b=new int[add];
        int p=0,n=0,m=0,reserve=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            m=e.getKey();
            reserve=n;//保留上一次便利到的地方
            n=e.getValue();
            while(p<reserve+n-1){
                b[p]=m;
            }
        }
        int size=b.length;
        //size个数 冒泡排序
        for(int i=0;i<=size-1;i++){
            for(int j=0;j<=size-2-i;j++){
                if(b[j]>b[j+1]){
                    swap(b,j,j+1);
                }
            }
        }
        int count=0;
        int sum=0;
        for(int i=0;i<size;i++){
            if(b[i]==0){
                count++;
                //count为0的个数，b[count]是第一个不为的数
            }
        }
        if(count<size-1){
            //需要变动位置的数字个数为count+1 交换下标为0和为count的值
            swap(b,0,count);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++){
            sb.append(b[i]);
        }
        System.out.println(sb);

    }
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
            if(sums==nums){
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
