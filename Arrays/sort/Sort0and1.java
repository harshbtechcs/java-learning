package Arrays.sort;

import java.util.Scanner;

public class Sort0and1 { 
    // static void sortAra(int []arr){
    //     int count=0;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0){
    //             count++;
    //         }

    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(i<count){
    //             arr[i]=0;
    //         }
    //         else{
    //             arr[i]=1;
    //         }

           
    //     }


    // }
    static void swap(int []arr,int left,int right){

        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

    }

     static void sortArausingpointer(int []arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0 ){
                swap(arr,left,right);
                left++;
                right--;


            }
            else if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;

            }

        }
     }



    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        // sortAra(arr);
        sortArausingpointer(arr);


        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    
}
