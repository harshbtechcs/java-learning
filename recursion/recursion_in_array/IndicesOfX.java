package recursion.recursion_in_array;

import java.util.ArrayList;
import java.util.Scanner;

public class IndicesOfX {


    static ArrayList<Integer> Indic(int []arr,int target,int idx){
        int n=arr.length;

        if(idx==n){
            return new ArrayList<Integer>();///return em[pty ] arraylist
 
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx]==target){
            ans.add(idx);
        }

        ArrayList<Integer> smallAns = Indic(arr, target, idx+1);

        ans.addAll(smallAns);
        return ans;
        
    }
    // static void Indic(int []arr,int target,int idx){
    //     int n=arr.length;

    //     if(idx==n){
    //         return;

    //     }
    //     if(arr[idx]==target){
    //         System.out.print(idx+" ");
    //     }

    //     Indic(arr, target, idx+1);
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

        ArrayList<Integer>ans =Indic(arr, target, idx);
       System.out.println(ans);
       }



    }
    
    

