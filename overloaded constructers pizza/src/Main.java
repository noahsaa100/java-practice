public class Main {
    public static void main(String[] args) {

        pizza();
    }

    public static void pizza(){

        Pizza pizza = new Pizza("thick crust", "tomato");

        System.out.println("Your ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);


    }
}