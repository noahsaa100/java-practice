import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        //try {
        //System.out.println("What animal do you want?");
        //System.out.println("1 = dog --- 2 = cat");
        //int choice = scanner.nextInt();

        while (true) {
            try {
                System.out.println("What animal do you want?");
                System.out.println("1 = dog --- 2 = cat");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    animal = new Dog();
                    animal.speak();
                    break;
                } else if (choice == 2) {
                    animal = new Cat();
                    animal.speak();
                    break;
                } else {
                    System.out.println("Invalid");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine();
            }

        }

    }
}