import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();

        System.out.print("How many student names to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name: ");
            studentNames.add(sc.nextLine());
        }

        System.out.println("Student names:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
