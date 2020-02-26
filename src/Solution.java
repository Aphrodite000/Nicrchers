import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder a=new StringBuilder();
        for(int i=n*n-(n-1);i<=n*n+(n-1);i=i+2){
            a.append(i);
            if(i!=n*n+(n-1)){
                a.append('+');
            }

        }
        System.out.println(a);


    }
}

