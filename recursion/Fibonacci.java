package recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;

        }
        else if(n==1){
            return 1;

        }
         return fib(n-1)+fib(n-2);


    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n= sc.nextInt();
        // int ans =fib(n);
        // System.out.println(ans);
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }
    }
    
}
