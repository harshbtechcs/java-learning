package arraylist;

import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    static void Reverselist(ArrayList<Integer>l1){
        int i=0;int j=l1.size()-1;
        while(i<j){

            Integer temp = Integer.valueOf(l1.get(i));
            l1.set(i,l1.get(j));
            l1.set(j,temp);


            i++;
            j--;

        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(5);
        l1.add(43);
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(66);
        l1.add(6);
        System.out.println(l1);
        // Reverselist(l1);
        // Collections.reverse(l1);

        Collections.sort(l1,Collections.reverseOrder());
        // Collections.reverseOrder(l1);
        System.out.println(l1);

        
    }
    
}
