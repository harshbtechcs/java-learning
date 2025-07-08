package rectangularloop;

import java.util.Scanner;

public class REctangularPttern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cloumns=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cloumns;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
