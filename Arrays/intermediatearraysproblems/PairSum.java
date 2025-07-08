package Arrays.intermediatearraysproblems;

import java.util.Scanner;

class Sum{
    int  ps(int []array,int k){
        int count=0;

        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==k){
                    count++;
                }
            }
        }

          return count; 
    }
}

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        Sum obj1 = new Sum();
        int p=obj1.ps(arr,target);
        System.out.println(p);


        }
    }
    

