package Arrays.intermediatearraysproblems;

import java.util.Scanner;

public class TripletPairSum {

    static int  triplet(int[]array,int k){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                for(int m=j+1;m<array.length;m++){
                    if(array[i]+array[j]+array[m]==k){
                        count++;
                    }
                }
            }
        }
        return count;

    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int p =triplet(arr,target);
        System.out.println(p);
    
    }
}
