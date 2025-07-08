package Arrays.spiralmatrix;

import java.util.Scanner;

public class GenerateSpiral {
    static void printarray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");


            }
            System.out.println();
        }
    }


    static int[][] spiral(int n) {
        int [][]arr= new int[n][n];
        int curr=1;

        int toprow = 0;
        int bottowrow = n - 1;
        int leftcol = 0;
        int rightcol = n- 1;
        

        while (curr<=n*n) {
            // top row---left col to right col

            for (int j = leftcol; j <= rightcol&&curr <=n * n; j++) {
               arr[toprow][j]=curr;
                curr++;
            }
            toprow++;

            // right col----top row to bottom row
            for (int i = toprow; i <= bottowrow&&curr <= n *n; i++) {
                arr[i][rightcol]=curr;
                curr++;
            }
            rightcol--;

            // bottorow----right col to left col
            for (int j = rightcol; j >= leftcol&&curr <=n * n; j--) {
                arr[bottowrow][j]=curr;
                curr++;

            }
            bottowrow--;

            // leftcol---- bottom row to top row
            for (int i = bottowrow; i >= toprow&&curr <=n * n; i--) {
                arr[i][leftcol]=curr;
                curr++;

            }
            leftcol++;

        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int [][]p= spiral(n);

        printarray(p);
    }
    
}
