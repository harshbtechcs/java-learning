package rectangularloop.numbersystem;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNumber=sc.nextInt();
        int ans=0;
        int pw=1;//power of 10

        while(decimalNumber>0){
            int parity=decimalNumber%2;
            ans+=parity*pw;

            pw*=10;
            decimalNumber=decimalNumber/2;


        }
        System.out.println(ans);
        sc.close();

    }
    
}
