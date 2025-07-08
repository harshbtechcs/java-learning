package Arrays.multipearray;
import java.util.*;


public class RotateArray {
     static void printarray(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }

    }

    static void transInPlace(int [][]arr,int r1)

    {
        for(int i=0;i<r1;i++){
            for(int j=i;j<r1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
        

    }

    static void reverseArray(int[]array){
        int i=0;
        int j=array.length-1;
        while(i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }

    }
    static void rotate(int [][]array,int n){

        transInPlace(array, n);
        for(int i=0;i<n;i++){
            reverseArray(array[i]);

        }





    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
         
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int [][]arr= new int [r1][c1];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        // printarray(arr);
        rotate(arr, r1);

        printarray(arr);

        

        
    }

    
}
