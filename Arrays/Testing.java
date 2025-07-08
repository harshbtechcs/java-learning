package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Testing {
    static void printArray(int []array){

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println();
    }


        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("original Array");
        printArray(arr);

        // int[] arr2=arr.clone();
        // int[]arr2= Arrays.copyOf(arr,2);
        int[]arr2= Arrays.copyOfRange(arr,1,3);
        System.out.println("Copied Array");
        printArray(arr2);

        // arr2[0]=0;
        // arr2[1]=0;
        // System.out.println("original Array after changing value");
        // printArray(arr);
        // System.out.println("copied Array After changing value");

        // printArray(arr2);



        
    }
    
}
