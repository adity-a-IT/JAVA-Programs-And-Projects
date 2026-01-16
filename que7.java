//print the sequence of numbers

import java.util.Scanner;
public class que7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the initlisation number");
        int initial=sc.nextInt();
        System.out.println("Enter the limit number");
        int limit=sc.nextInt();
        System.out.println("RESULT");
        /*for(int i=initial;i<=limit;i++){
            System.out.print(i+" ");
        }
        */
        /*int i=initial;
        while(i<=limit){
            System.out.print(i+" ");
            i++;
        }
            */
        
        int i=initial;
        do{
            System.out.print(i+" ");
            i++;
        }
        while(i<=limit);
    }    
}
