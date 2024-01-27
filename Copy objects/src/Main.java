public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("BMW", "1 series", 2020);
        //Car car2 = new Car("Mercedes", "benz", 2012);

        //car1.copy(car2);

        Car car2 = new Car(car1);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println();

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());


    }
}