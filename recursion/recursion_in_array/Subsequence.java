package recursion.recursion_in_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    static ArrayList<String> subseq(String s){
        ArrayList<String> ans = new ArrayList<>();
        //base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }


        char ch = s.charAt(0) ;
        ArrayList<String> smallAns= subseq(s.substring(1));
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(ch+ ss);

        }


        return ans;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayList<String> p= subseq(s);
        System.out.println(p);

        
    }
    
}
