import java.util.Scanner;

public class FrequencyArray {
    static int [] freqArray(int []array){
        int []freq= new int[100001];

        for(int i=0;i<array.length;i++){
            freq[array[i]]++;

        }

        return freq;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[]= new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int []freq= freqArray(arr);

        
        int q= sc.nextInt();
        while(q>0){
            System.out.println("enter elemenst to searched");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
    
}
