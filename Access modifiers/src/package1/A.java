package package1;
import package2.*;
public class A {
    protected String protectedMessage = "This is protected in package 1";
    public static void main(String[] args){
        //public messages can be accessed anywhere
        C c = new C();
        System.out.println(c.publicMessage);



    }
}
