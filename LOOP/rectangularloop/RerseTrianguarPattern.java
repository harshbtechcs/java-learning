package rectangularloop;

import java.util.*;


public class RerseTrianguarPattern {
    
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        // int cloumns=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}

