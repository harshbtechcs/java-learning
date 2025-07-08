package recursion;
import java.util.Scanner;


public class SumOfDigits {
    static int sum(int n){

        // base case
        if(n>=0 && n<=9){
            return n;

        }
        // recursive work
        int smallans= sum(n/10);
        int ans= sum(n/10)+n%10;
         
        return ans;




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         int p= sum(n);
         System.out.println(p);


        
    }
    
    
}
