package Arrays;

import java.util.Scanner;

public class GreaterElements {
    static int Strictly(int[] array,int k){
        int count=0;

          for(int i=0;i<array.length;i++){
            if(array[i]>k){
                count++;
            }




           }


        return count;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         int k= sc.nextInt();

        int []arr= new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

      int p = Strictly(arr,k);
      System.out.println(p);
        

        
    }
    
}
