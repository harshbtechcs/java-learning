package recursion;

import java.util.Scanner;

public class CountOfDigit {
    static int count(int n){
        if(n==0){
            return 0;
        }
        return 1 + count(n / 10);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
       int p = count(n);
       System.out.println(p);

    }
    
}

// time complexity - O(n);
// space complexity -O(n)
