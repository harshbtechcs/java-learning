package recursion.recursion_in_array;

import java.util.Scanner;

public class ReverseString {
    static String reverse(String s,int idx){
        int n=s.length();

        if(idx==n){
            return "";
        }
        String smallAns=reverse(s, idx+1);

        return smallAns+s.charAt(idx);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        int idx=0;
         String str=reverse(s,idx);

         if(str.equals(s)){
            System.out.println("palindrome");

         }
         else{
            System.out.println("not palindrome");
         }
        //  System.out.println(str);
    }
    
}
