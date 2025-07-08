package oops.skills;



public class Main {
    public String str="I am boy";

    void printfromclasses(){
        System.out.println("within class"+str);

    }


    public static void main(String[] args) {

        Main Obj= new Main();
        Obj.printfromclasses();
        Access print = new Access();
       print.printfromOutsideclass();
       

        

    }
    
}

class Access{
    void printfromOutsideclass(){
    Main Obj1= new Main();
    System.out.println("outside class:"+ Obj1.str);
}



}
