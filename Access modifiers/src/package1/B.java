package package1;
import package2.*;

public class B {
    public static void main(String[] args) {
        //Protected can be accessed if class is in same package
        A a = new A();
        System.out.println(a.protectedMessage);
    }


}
