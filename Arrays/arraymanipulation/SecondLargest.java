package Arrays.arraymanipulation;

import java.util.Scanner;

public class SecondLargest {

    static int max(int[] array) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mx) {
                mx = array[i];
            }
        }
        return mx;
    }

    static int secondMax(int[] array) {
        int mx = max(array);

        // Replace all occurrences of max with Integer.MIN_VALUE
        for (int i = 0; i < array.length; i++) {
            if (array[i] == mx) {
                array[i] = Integer.MIN_VALUE;
            }
        }

        // Now find the max again which will effectively be the second max
        int secondMax = max(array);
        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = secondMax(arr);
        System.out.println(p);
    }
}