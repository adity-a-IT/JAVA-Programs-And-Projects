/*Check odd and even */
import java.util.Scanner;
public class que3 {
    public static void main(String args[]){
        System.out.println("Enter the number ");
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
