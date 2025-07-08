package Arrays.multipearray;

import java.util.Scanner;

public class TransposeArray {

    static void printarray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }

    static void transInPlace(int [][]arr,int r1,int c1)

    {
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        printarray(arr);

    }

    // static void trans(int [][]arr,int r1,int c1){
    //      int ans[][]= new int [r1][c1];
        
    //     for(int i=0;i<r1;i++){
    //         for(int j=0;j<c1;j++){
    //             ans[i][j]=arr[j][i];
    //         }
    //     }

    //  printarray(ans);

    // }
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
        
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr= new int [r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        // trans(arr, r1, c1);
           transInPlace(arr, r1, c1);
    
    
    }
}
