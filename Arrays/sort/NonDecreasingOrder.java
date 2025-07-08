package Arrays.sort;

import java.util.Scanner;

public class NonDecreasingOrder {

    static int[] nondec(int []arr){
        int n= arr.length;
        int left=0;
        int right=n-1;
        int j=0;

        int ans[]= new int[n];
        
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;

            }
            else{
                ans[j++]=arr[right]*arr[right];
                right--;
            }
        }
       return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int []p= nondec(arr);

        for(int i=p.length-1;i>=0;i--){
            System.out.print(p[i]+" ");
        }
    }
    
}
