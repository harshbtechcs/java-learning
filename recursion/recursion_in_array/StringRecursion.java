package recursion.recursion_in_array;

import java.util.Scanner;

public class StringRecursion {

    static String removeOccurence2(String s){
        int n = s.length();

        if(n==0){
            return "";

        }
        String smallAns= removeOccurence2(s.substring(1));

        char curr = s.charAt(0);
        if(curr!='a'){
            return curr+smallAns;
        }
        else{
            return smallAns;
        }



    }
    // static String removeOccurence(String s ,int idx){
    //     int n = s.length();

    //     if(idx==n){
    //         return "";

    //     }
    //     String smallAns= removeOccurence(s, idx+1);

    //     char curr = s.charAt(idx);
    //     if(curr!='a'){
    //         return curr+smallAns;
    //     }
    //     else{
    //         return smallAns;
    //     }



    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // char ch=sc.next().charAt(0);
        int idx=0;
        // String str=removeOccurence(s,idx);
        String str =removeOccurence2(s);

        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
        }

    }
    
}
