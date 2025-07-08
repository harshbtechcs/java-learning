package Arrays.spiralmatrix;

import java.util.Scanner;

public class spiral {
    static void printarray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    static void spiral(int[][] arr, int r1, int c1) {
        int toprow = 0;
        int bottowrow = r1 - 1;
        int leftcol = 0;
        int rightcol = c1 - 1;
        int total_elements = 0;

        while (total_elements < r1 * c1) {
            // top row---left col to right col

            for (int j = leftcol; j <= rightcol&&total_elements < r1 * c1; j++) {
                System.out.print(arr[toprow][j]+" ");
                total_elements++;
            }
            toprow++;

            // right col----top row to bottom row
            for (int i = toprow; i <= bottowrow&&total_elements < r1 * c1; i++) {
                System.out.print(arr[i][rightcol]+" ");
                total_elements++;
            }
            rightcol--;

            // bottorow----right col to left col
            for (int j = rightcol; j >= leftcol&&total_elements < r1 * c1; j--) {
                System.out.print(arr[bottowrow][j]+" ");
                total_elements++;

            }
            bottowrow--;

            // leftcol---- bottom row to top row
            for (int i = bottowrow; i >= toprow&&total_elements < r1 * c1; i--) {
                System.out.print(arr[i][leftcol]+" ");
                total_elements++;

            }
            leftcol++;

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        int total_elements = r1 * c1;
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        spiral(arr, r1, c1);

    }

}
