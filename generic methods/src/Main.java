public class Main {
    public static void main(String args[]) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] characterArray = {'A', 'B', 'C', 'D', 'E'};
        String[] stringArray = {"H", "E", "L", "L", "O"};
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(characterArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(characterArray));
        System.out.println(getFirst(stringArray));
    }


        public static <T> void displayArray (T[]array){
            for (T x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    public static <T> T getFirst(T[]array){

        return array[0];
    }
}
