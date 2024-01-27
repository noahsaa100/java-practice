public class Main {
    public static void main(String[] args) {
        vehicles();


    }
    public static void vehicles(){
        Car car1 = new Car("BMW", "1 Series", 2007);

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println();

        car1.setMake("Mercedes");
        car1.setModel("Benz");
        car1.setYear(2022);
        System.out.println(car1);

        
    }
}