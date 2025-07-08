package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestAndLargestElements {
    static int[] smallestElements(int[] array, int k) {

        Arrays.sort(array);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = array[i];

        }

        return ans;
    }

    static int[] greaterElements(int[] array, int k) {

        Arrays.sort(array);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = array[array.length-1-i];

        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        // int[] p= smallestElements(arr,k);
        int[] p = greaterElements(arr, k);
        for (int x : p) {
            System.out.print(x + " ");

        }

    }

}
