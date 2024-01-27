public class Main {
    public static void main(String[] args) {
        //Uses many classes
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        //Use one generic class
        MyGenericClass<Integer> myInt1 = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble1 = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar1 = new MyGenericClass<>('@');
        MyGenericClass<String> myString1 = new MyGenericClass<>("Hello");

        System.out.println(myInt1.getValue());
        System.out.println(myDouble1.getValue());
        System.out.println(myChar1.getValue());
        System.out.println(myString1.getValue());

    }
}