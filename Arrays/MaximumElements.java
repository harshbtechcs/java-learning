package Arrays;

import java.util.Scanner;

class Def{
    void max(int []arr1){
        int a=0;
        for(int i=0;i<arr1.length;i++){
            if(a<arr1[i]){
                a=arr1[i];

            }
        }
        System.out.println(a);

    }


}

public class MaximumElements { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Def Obj = new Def();
        int n= sc.nextInt();
        int arr[]= new int[4];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            
        }
        Obj.max(arr);



        
    }
    
}
