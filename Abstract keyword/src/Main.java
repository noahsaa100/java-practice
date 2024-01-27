public class Main {
    public static void main(String[] args) {
        //abstract classes can not be insantiated but can have a subclass e.g Car

        //Vehicle vehicle = new Vehicle();   this will not work as vehicle is abstract
        Car car1 = new Car("BMW");
        car1.go();

    }
}