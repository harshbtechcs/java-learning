package recursion.recursion_in_array;

import java.util.Scanner;

public class MaxArray {

    static int max(int[]arr,int idx){
        int n=arr.length;

        if(idx==n-1){
            return arr[idx];

        }
        int smallAns=max(arr,idx+1);

        return Math.max(smallAns, arr[idx]);


    }
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int idx=0;
        int p=max(arr,idx);
        System.out.println(p);

    }
    
}
