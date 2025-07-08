package Arrays.sort;

import java.util.Scanner;

public class SortEvenOdd {

    static void swap(int []arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void evenSort(int []arr){
        int n= arr.length;
        int left=0;
        int right=n-1;
        
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;


            }
            else if(arr[left]%2==0){
                left++;
                

            }
            else if(arr[right]%2==1){
                
                right--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }
        evenSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
    
}
