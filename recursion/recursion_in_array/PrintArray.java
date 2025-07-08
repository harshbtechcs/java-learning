package recursion.recursion_in_array;

import java.util.Scanner;

public class PrintArray {
    static void printy(int []arr,int idx){
        int n=arr.length;
       

        if(idx==n){
            return;
        }
         System.out.println(arr[idx]);
        printy(arr, idx +1);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int idx=0;
        printy(arr,idx);

        
        
    }
    
}
