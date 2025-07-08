package Arrays;

import java.util.Scanner;
class Abc{
    void sum(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    }
}

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
           
        }
        Abc Obj =new Abc();
        Obj.sum(array);
        
    }
    
}
