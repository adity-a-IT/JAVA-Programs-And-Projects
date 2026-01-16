/*Take two variables 'a' & 'b' and print their sum */
import java.util.Scanner;
public class que2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of integer a: ");
        int a=sc.nextInt();
        System.out.println("enter  the value of integer b : ");
        int b= sc.nextInt();
        int sum =a+b;
        System.out.println("Sum of a and b is:");
        System.out.print(sum);
    }
}
