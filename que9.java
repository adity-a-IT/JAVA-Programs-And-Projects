/*Print table of any number */
import java.util.Scanner;
public class que9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print");
        int n=sc.nextInt();
        System.out.println("table of "+n+" is");
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
    }
}
