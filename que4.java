/*Check which one is greater of two number */
import java.util.Scanner;
public class que4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer a ");
        int a=sc.nextInt();
        System.out.println("Enter the integer b ");
        int b=sc.nextInt();
        
        if(a==b){
            System.out.println("a is equal to b ");
        }
        else if(a>b){
                System.out.println("a is greater then b ");
            }
        else{
            System.out.println("b is greater then a ");
            }
        }
    }

