/*Pattern  Palindrome Pattern
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
import java.util.Scanner;
public class pattern13 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i;
        for(i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");  //spaces
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);        //first half
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);            //second half
            }
            System.out.println();
        }    
    }
    
}
