import java.util.Random;

public class DiceRoller {
    Random random;
    int number;
    int total;
    DiceRoller(){
        for (int i = 0; i<10; i++) {
            random = new Random();
            roll();
        }
        if (total > 30){
            System.out.println("You win");
        } else{
            System.out.println("You Lose");
        }


    }
    void roll(){
        number = random.nextInt(6)+1;
        total += number;
        System.out.println(total);



    }
}
