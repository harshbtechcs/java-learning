import java.util.*;
public class countdigigits{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;

    if (n==0) {
        System.out.println(1);

        
    } else {
        while(n>0){
            n=n/10;
            count++;
        }
      System.out.println(count);  
    }
       sc.close();
        
    }

}