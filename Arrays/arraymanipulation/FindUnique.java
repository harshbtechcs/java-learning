package Arrays.arraymanipulation;

import java.util.Scanner;

public class FindUnique {
    static int unique(int []array){
        int n=array.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }

        }

        for(int i=0;i<n;i++){
            if(array[i]>-1){
                ans=array[i];
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        int p = unique(arr);
    }

}
