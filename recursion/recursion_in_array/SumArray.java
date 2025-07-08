package recursion.recursion_in_array;

import java.util.Scanner;

public class SumArray {
    static int sum(int []arr,int idx){
        // if(idx==arr.length-1){
        //     return arr[idx];
        // }

        // for handling empty array
        if(idx==arr.length){
            return 0;

        }
        int smallAns=sum(arr, idx+1);

        return smallAns+arr[idx];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int idx=0;
        int x=sum(arr,idx);
        System.out.println(x);
    }
    
}
