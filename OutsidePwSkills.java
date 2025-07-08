import oops.skills.*;




public class OutsidePwSkills {
    App Obj= new App();
    public static void main(String[] args) {
        Main aa = new Main();
        String p =aa.str;
        System.out.println(p);
        Main3 bje= new Main3();
        bje.childclass();


    }

    
    
}
//child class ban gayi Main class ki
class Main3 extends Main{

    void childclass(){
        Main3 Object= new Main3();

        System.out.println("child class"+Object.str);
    }

}
