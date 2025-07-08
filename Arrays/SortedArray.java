package Arrays;

import java.util.Scanner;

public class SortedArray {
    static boolean isSorted(int[]array){
        boolean check= true;

        for(int i=1;i<array.length;i++){
            if(array[i-1]<array[i]){
                check =false;


            }


        }





        return check;


    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int []arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        boolean p =isSorted(arr);
        System.out.println(p);
    }
    
}
