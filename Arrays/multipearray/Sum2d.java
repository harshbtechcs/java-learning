package Arrays.multipearray;

import java.util.Scanner;

public class Sum2d {

    static void printarray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }
    static void multiply(int[][]arr,int r1,int c1,int [][]arr1,int r2,int c2){
        if(c1!=r2){
            System.out.println("multiplication not possibe");
            return;

        }
        int [][]mul= new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){

                for(int k=0;k<c1;k++){
                    mul[i][j]+=arr[i][k]*arr1[k][j];
                }

            }
        }
        printarray(mul);


    }


    // static void addition(int[][]arr,int r1,int c1,int [][]arr1,int r2,int c2){

    //     if(r1!=r2||c1!=c2){
    //         System.out.println("wrong dimensions");
    //         return;
    //     }

    //     int [][]sum= new int[r1][c1];
    //     for(int i=0;i<r1;i++){
    //         for(int j=0;j<c1;j++){
    //             sum[i][j]=arr[i][j]+arr1[i][j];

    //         }
    //     }

    //     printarray(sum);


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
        System.out.println("eneter second matrix data");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int [][]arr1=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr1[i][j]=sc.nextInt();

            }
        }

        multiply(arr,r1,c1,arr1,r2,c2);



    }
    
}
