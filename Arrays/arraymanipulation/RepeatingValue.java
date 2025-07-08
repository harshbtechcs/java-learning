package Arrays.arraymanipulation;

import java.util.Scanner;

public class RepeatingValue {

    static int repeat(int []array)
    {
        int ans=-1;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    return array[i];

                }
                
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p=repeat(arr);
        System.out.println(p);
    
    }
    
}
