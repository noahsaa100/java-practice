
import java.io.*;

public class Main {
    public static void main(String[] args) {

        poem();

    }
    public static void poem() {
        File file2 = new File("poem.txt");
        if (file2.exists()) {
            try {
                //create writer

                FileWriter writer = new FileWriter("poem.txt");


                writer.write("Lets go\nRoses are red\nVioles are bareee blue");
                writer.append("");
                writer.close();

                //create reader

                FileReader reader = new FileReader("poem.txt");
                int data = reader.read();

                while(data != -1){
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



    public static void secretMessage() {
        File file = new File("SecretMessage.txt");


        if (file.exists()) {
            System.out.println("File exsists");
            System.out.println(file.getPath());
            System.out.println(file.isFile());

        } else {
            System.out.println("File doesnt exsist");
        }
    }
}