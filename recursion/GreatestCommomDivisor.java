package recursion;

import java.util.Scanner;

public class GreatestCommomDivisor {
    // brue force approach

    // static int gcd(int n, int m) {
    //     int gcd = 1;
       
    //     for(int i=1;i<=Math.min(n,m);i++){
    //         if(n%i==0 && m%i==0){
    //             gcd = i;
    //         }
    //     }
    //     return gcd;
    // }

    // tc for this approach is O(min(n,m))=O(n);
    // sc is O(1);


    // SecondApproach

    // static int gcd(int n,int m){
    //     while(n%m!=0){
    //         int rem = n%m;
    //         n=m;
    //         m=rem;
    //     }
    //     return m;
    // }
   // euclid's Algorithm by recursion
   static int gcd(int n,int m){
    if(m==0){
        return n;

    }
    return gcd(m,n%m);
   }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = gcd(n, m);
        System.out.println(gcd);
    }

}
