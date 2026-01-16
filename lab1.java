import java.util.Scanner;
public class lab1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row number");
        int rows=sc.nextInt();
        System.out.println("Enter the column number");
        int columns=sc.nextInt();
        int [][] matrix_A=new int[rows][columns];
        int [][] matrix_B=new int[rows][columns];
        System.out.println("Enter the elements of Matrix A");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix_A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix B");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix_B[i][j]=sc.nextInt();
            }
        }
        
        int[][] sum =new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                sum[i][j]=matrix_A[i][j] +matrix_B[i][j];
            }
        }

        System.out.println("Sum matrix : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
