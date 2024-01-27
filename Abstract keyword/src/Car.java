public class Car extends Vehicle{

    Car(String name){
        super(name);
    }

    @Override
    void go() {
        System.out.println("Car is driving and is a " + name);
    }
}
