package Arrays;

import java.util.Scanner;

class Search{
    void searche(int []arr1,int k){
        int ans=-1;
        for(int i=0;i<arr1.length;i++){
            if(k==arr1[i]){
                ans=i;
            }     
        }
         System.out.println(ans);
    }
}

public class SearchGivenElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int []arr= new int[n];
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         int searchElement=sc.nextInt();
         Search Obj= new Search();
         Obj.searche(arr,searchElement);
    }
    
}
