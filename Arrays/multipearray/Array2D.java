package Arrays.multipearray;

import java.util.Scanner;

public class Array2D {

    static void printarray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr= new int[2][3];
        // int [][]arr1={{1,2,3},{4,5,6},{7,8,9}};
        // printarray(arr1);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();


            }
        }
         
        printarray(arr);

        
    }
    
}
