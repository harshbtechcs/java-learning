package Arrays;

import java.util.Scanner;
class Occur{
    void hh(int []array,int k){
        int count=0;


        for(int i=0;i<array.length;i++){
            if(k==array[i]){
                count++;

            }

        }
        System.out.println(count);


    }


}

public class Occurence {
    static int lastOccurence(int[]array, int k){
        int lastIndex=-1;

        for(int i=0;i<array.length;i++){
            if(array[i]==k){
                lastIndex=i;
            }

        }
        return lastIndex;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n= sc.nextInt();
        int[]arr= new int[n];
        int k=sc.nextInt();


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Occur Obj = new Occur();
        // Obj.hh(arr,k);

        int p=lastOccurence(arr, k);
        System.out.println(p);
    }
    
}
