// package Arrays.reverse;

// import java.util.Scanner;

// public class ReverseArray { 
//     static int[] revers(int []array){
//        int n= array.length;

//     int []ans=new int[n];
//     int j=0;
    
//         for(int i=array.length-1;i>=0;i--){
//             ans[j++]=array[i];

//         }

//         return ans;

    
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int []arr = new int[n];

//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();

//         }

//         int []p=revers(arr);
//         for(int i=0;i<p.length;i++){
//         System.out.print(p[i]+" ");


//         }
//     }
    
// }


// //new memory mat use karo usi array me kaam karlo 

// // to we use inplace approach

import java.util.Scanner;

public class ReverseArray { 
 
        static void swap(int []arr,int i, int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }

        static void reverseArra(int []arr){
            int i=0;
            int j=arr.length-1;

            while(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
            

        }
        
 public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        reverseArra(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}