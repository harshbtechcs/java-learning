package recursion.recursion_in_array;

import java.util.Scanner;

public class LinearSearch {


    static int  search(int[]arr ,int target ,int idx){

        if(idx==arr.length){
            return -1;

        }
        
        if(arr[idx]==target){
            return idx;
        }

        return search(arr, target, idx+1);



    }

    // static boolean search(int[]arr ,int target ,int idx){

    //     if(idx==arr.length){
    //         return false;

    //     }
        
    //     if(arr[idx]==target){
    //         return true;
    //     }

    //     return search(arr, target, idx+1);



    // }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();

        int idx = 0;
    //    boolean x =search(arr,target, idx);
    int x =search(arr, target, idx);
       System.out.println(x);

    }

}
