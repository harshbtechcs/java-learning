import java.util.*;


public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;

        if(n==0){
            System.out.println(0);
        }
        else{
        while(n >0){


            sum += n%10;
            n=n/10;

        }
        System.out.println(sum);
    }
        sc.close();
    }
    


    
    }
    

