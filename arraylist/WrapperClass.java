package arraylist;
import java.lang.Integer;
import java.util.ArrayList;


public class WrapperClass {

    static void arraycheck(ArrayList<Integer> l1){
        l1.add(2,55);


    }
    public static void main(String[] args) {
        // Integer i = Integer.valueOf(3);
        // // System.out.println(i);

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(5);
        l1.add(4);
        l1.add(3);
        l1.add(10);

        // System.out.println(l1.get(0));
        // for(int in=0;in<l1.size();in++){
        //     System.out.print(l1.get(in)+" ");
        // }

        // arraycheck(l1);
        // System.out.println(l1);

        ArrayList l2= new ArrayList();
        l2.add("p");
        l2.add(4.35f);
        l2.add(5);
        l2.add(true);
        System.out.print(l2+" ");

    



    }
    
}
