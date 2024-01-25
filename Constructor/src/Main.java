public class Main {
    public static void main(String[] args) {
        human();
    }
    public static void human(){
        Human human = new Human("Noah", 20, 90.21);
        Human human2 = new Human("Aasiyah", 18, 70);

        System.out.println(human2.name);
        human.eat();
        human2.drink();
    }
}