
import java.util.Scanner;


public class PatikaDevYildizTers {
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num=scan.nextInt();
        
         for ( int a = 0; a < num; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
                
            }
            for (int c = 1; c <= ( 2 * num - (2 * a + 1 ) ); c++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        
        
    }
    }
}

