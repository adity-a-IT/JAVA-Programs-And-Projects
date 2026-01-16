import java.util.Scanner;
public class que6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("----------MENU---------");
        System.out.println("Button = 1 for Hello");
        System.out.println("Button = 2 for Namaste ");
        System.out.println("Button = 3 for Bonjour");
        System.out.println("Enter your Button");
        int button = sc.nextInt();

        /*if(button==1){
            System.out.println("Hello");
        }
        else if(button == 2){
            System.out.println("Namaste");
        }
        else if(button == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid button");
        }*/
        
        switch(button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("invalid button!!\nPlease Enter the correct button");
        }
    }
}
