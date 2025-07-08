package Arrays.prefixsum;

import java.util.Scanner;

public class check {

    static void su(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();

        }
         su(arr);

         int q= sc.nextInt();
         while(q-->0){
            int l=sc.nextInt();
            int r= sc.nextInt();
            int ans= arr[r]-arr[l-1];

           
            System.out.println(ans);

         }
        

    }
    
}
