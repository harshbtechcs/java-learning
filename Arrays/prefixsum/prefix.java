package Arrays.prefixsum;

import java.util.Scanner;

public class prefix {
    // static int[] sum(int []arr){
    //     int n=arr.length;
    //     int []prefixs= new int[n];
    //     prefixs[0]=arr[0];
    //     for(int i=1;i<n;i++){
    //         prefixs[i]=prefixs[i-1]+arr[i];
    //     }
    //     return prefixs;
    // }
    static void s(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
    //   int ps[]=  sum(arr);
    //   for(int x:ps){
    //     System.out.print(x+" ");
    //   }
        s(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }


    }
    
}
