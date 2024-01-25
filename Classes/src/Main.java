
public class Main {

    public static void main(String[] args) {
        car myCar = new car();
        car myCar2 = new car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.brake();
        System.out.println();

        System.out.println(myCar2.model);
        System.out.println(myCar2.make);
        myCar2.drive();
        myCar2.brake();
    }


}