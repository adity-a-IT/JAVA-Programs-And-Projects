/*Pattern diamond
   *
  ***
 *****
*******
 *****
  ***
   *
*/ 
import java.util.Scanner;
public class pattern14 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int n=sc.nextInt();
        
        //upward
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){            //spaces
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");          //first half 
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //downward
        for(int i=n;i>=1;i--){                  
            for(int j=1;j<=n-i;j++){            //spaces
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");          //first half 
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
