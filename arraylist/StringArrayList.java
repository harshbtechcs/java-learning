

package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public  class StringArrayList{
    public static void main(String[] args) {
        
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("to");

        l1.add("physics");
        l1.add("wallah");
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println(l1);
        
    }
}