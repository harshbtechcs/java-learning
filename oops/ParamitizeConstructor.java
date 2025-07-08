package oops;

class Algebra2{
    int a;
    int b;

    Algebra2(int x,int y){
        a=x;
        b=y;


    }

    int add(){
        return a+b;

    }

}

public class ParamitizeConstructor {
    public static void main(String[] args) {
        Algebra2 Obj= new Algebra2(5,7);

        int sum=Obj.add();
        System.out.println(sum);


        

        
    }
    
}
