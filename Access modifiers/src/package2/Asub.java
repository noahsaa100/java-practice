package package2;

import package1.*;

public class Asub extends A {
    public static void main(String[] args){
        //protected messages can be accessed in same package and packages that extend
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);
        C c = new C();
        System.out.println(c.protectedMessage);
    }
}
