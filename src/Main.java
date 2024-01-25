import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        questions();


    }

    public static void questions(){
        double principal = 0;
        double interest = 0;
        int period = 0;

        double interestRate= 0;
        int periodNew = 0;

        Scanner scanner = new Scanner(System.in);



        while(true) {
            System.out.print("Principal (1k - 1M: ");
            principal = scanner.nextDouble();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1k and 1m");
        }



        while (true) {
            System.out.println("Annual Interest Rate: ");
            interest = scanner.nextDouble();
            if (interest >=1 && interest<=10) {
                interestRate = interest / 100;
                break;
            }
            System.out.println("Interest rate has to be between 1-10");
        }


        while(true) {
            System.out.println("Period (Years: ");
            period = scanner.nextInt();
            if(period >=3 && period <=100) {
                periodNew = period * 12;
                break;
            }
            System.out.println("Period has to be between 3 and 100");
        }




        double power2 =Math.pow(interestRate + 1, periodNew);
        double power3 =(power2)/ (Math.pow(interestRate + 1, periodNew) - 1);
        double mortgage = power3 * principal;
        NumberFormat defaultCurrencyFormat = NumberFormat.getCurrencyInstance();
        String defaultFormattedAmount = defaultCurrencyFormat.format(mortgage);

        System.out.println("Mortgage: " + defaultFormattedAmount);


    }


}
