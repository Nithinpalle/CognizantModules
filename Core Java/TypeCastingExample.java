public class TypeCastingExample {
    public static void main(String[] args) {
        double myDouble = 9.99;
        int myInt = (int) myDouble;  // Explicit casting: double to int
        System.out.println("Double to Int: " + myInt);

        int anotherInt = 50;
        double newDouble = anotherInt;  // Implicit casting: int to double
        System.out.println("Int to Double: " + newDouble);
    }
}
