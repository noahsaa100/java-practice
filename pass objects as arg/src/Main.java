public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Suzuki");
        Car car3 = new Car("Seat");
        Car car4 = new Car("Range Rover");
        Car car5 = new Car("Mercedes", 2019);



        garage.park(car5);
        garage.park(car4);

    }
}