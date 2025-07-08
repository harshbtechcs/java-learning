package recursion.recursion_in_array;

import java.util.Scanner;

public class PalindromeWithoutReverse {
    static boolean palin(String s,int l, int  r ){
        if(l>=r){
            return true;
        }

       return  s.charAt(l)==s.charAt(r)&&palin(s, l+1, r-1);


        }

        

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l =0;
        int r = s.length() - 1;

       boolean x= palin(s,l,r);
       System.out.println(x);



    }

}
