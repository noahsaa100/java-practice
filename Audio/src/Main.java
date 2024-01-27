import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;


public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
       music();
    }
    public static void music() throws UnsupportedAudioFileException, LineUnavailableException, IOException{
        Scanner scanner = new Scanner(System.in);
        File file = new File("neenah.wav");
        AudioInputStream audioStream = getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        String response = "";


        while(!response.equals("Q")){
            System.out.println("P = Play ----- S = Stop ----- R = Reset ----- Q = Quit");
            System.out.println("Enter your choice");
            response = scanner.next();
            response = response.toUpperCase();

            switch(response){
                case("P"): clip.start();
                break;
                case("S"): clip.stop();
                case("R"): clip.setMicrosecondPosition(0);
                break;
                case("Q"): clip.close();
                break;
                default:
                    System.out.println("Not Valid");
            }

        }
        System.out.println("Finished");

    }
}
