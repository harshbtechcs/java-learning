package Arrays;

import java.util.Scanner;
class Arra{

    void bbc(int []arr1){
        int sum=0;
        int sum1=0;
        
for(int i=0;i<arr1.length/2;i++){
    sum+=arr1[i];
}
for(int i=arr1.length;i<arr1.length;i++){
    sum1+=arr1[i];

}
// int ans=sum-sum1;
if(sum>sum1){
    int ans=sum-sum1;
    ans+=arr1[arr1.length/2];

System.out.println(ans);
}


    }
}

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arra Obj1 = new Arra();
        Obj1.bbc(arr);

    }
    
}
