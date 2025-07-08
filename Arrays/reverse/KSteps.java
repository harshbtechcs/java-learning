import java.util.Scanner;

public class KSteps {
    // static int[] rotatesteps(int[] array, int k) {
    // int n = array.length;
    // k = k % n;
    // int[] ans = new int[n];
    // int j = 0;
    // for (int i = n - k; i < n; i++) {
    // ans[j++] = array[i];

    // }
    // for (int i = 0; i < n - k; i++) {
    // ans[j++] = array[i];
    // }

    // return ans;

    // }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }

    }

    static void inplacerotate(int[] array, int k) {
        int n = array.length;
        k = k % n;

        reverse(array, 0, n - k - 1);
        reverse(array, n - k, n - 1);
        reverse(array, 0, n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        inplacerotate(arr, k);

        // int[] p = rotatesteps(arr, k);
        // for (int i = 0; i < p.length; i++) {
        // System.out.print(p[i] + " ");

        // }
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }

}
