package recursion;

import java.util.Scanner;

public class KMultiple {
    static void mul(int num,int k){
        if(k==1){
            System.out.print(5+" ");
            return;


        }
        mul(num, k-1);
        System.out.print(num*k+" ");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();
        int k=sc.nextInt();
        mul(num,k);
    }
    
}
