package package2;
import package1.*;

public class C {
    public String publicMessage = "This is public";
    String defaultMessage = "this is the default";
    protected String protectedMessage = "This is protected in package 2";
    private String privateMessage = "This is private";
//private only accessed within its own class
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.privateMessage);
    }
}
