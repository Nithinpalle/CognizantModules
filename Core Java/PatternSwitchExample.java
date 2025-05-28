public class PatternSwitchExample {
    public static void main(String[] args) {
        printObjectType(123);
        printObjectType("Hello");
        printObjectType(45.67);
    }

    static void printObjectType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }
}
