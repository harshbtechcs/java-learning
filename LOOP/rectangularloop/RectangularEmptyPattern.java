package rectangularloop;

import java.util.Scanner;

public class RectangularEmptyPattern {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows= sc.nextInt();
        int cloumns=sc.nextInt();

        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cloumns;j++){
                if(i==1||i==rows||j==1||j==cloumns){

                
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
