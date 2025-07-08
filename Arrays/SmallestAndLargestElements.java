package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestAndLargestElements {

    static int[] smallAndBig(int[] array){

        Arrays.sort(array);
        int n= array.length;
        int[] ans= {array[0],array[n-1]};

        // return new int[]{array[0] , array[n-1]};
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int []p=smallAndBig(arr);
        System.out.println(p[0]);
        System.out.println(p[p.length-1]);

    }

}
