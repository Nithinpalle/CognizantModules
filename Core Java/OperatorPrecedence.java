public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2; // Multiplication has higher precedence
        System.out.println("Result of 10 + 5 * 2 = " + result);

        int correctResult = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + correctResult);
    }
}
