//Print the sum of n numbers

import java.util.Scanner;
public class que8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial number");
        int initial=sc.nextInt();
        System.out.println("Enter the last number");
        int last=sc.nextInt();
        int sum=0;
        for(int i=initial;i<=last;i++){
            sum=sum+i;
            
        }
        System.out.println("Sum is");
        System.out.println(sum);
    }
}
