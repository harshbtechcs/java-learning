package recursion;

import java.util.Scanner;


public class Factorial {
    static int facto(int n){

        if(n==0){
            return 1;
        }
        int smallans= facto(n-1);
        //self work;

        int ans =n*smallans;

        return ans;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans=facto(n);
        System.out.println(ans);


        
    }
    
}
