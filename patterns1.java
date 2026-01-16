/*Pattern 

1) solid rectangle 
* * * * * *
* * * * * *
* * * * * *

*/


import java.util.Scanner;
public class patterns1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row=sc.nextInt();
        System.out.println("Enter the nubmber of column");
        int column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
