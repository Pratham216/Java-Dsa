import java.util.Scanner;

public class StringOper {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String choice;

        do {

            System.out.println("Menu");
            System.out.println("1. String Operations");
            System.out.println("2. String Buffer Operations");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    stringOperations(scanner);
                    break;
                case "2":
                    stringBufferOperations(scanner);
                    break;
                case "3":
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }

    private static void stringOperations(Scanner scanner) {
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // String operations
        System.out.println("String Length: " + str.length());
        System.out.println("String In Uppercase: " + str.toUpperCase());
        System.out.println("String in Lowercase: " + str.toLowerCase());
    }

    private static void stringBufferOperations(Scanner scanner) {
        System.out.print("Enter a string for StringBuffer: ");
        StringBuffer strBuffer = new StringBuffer(scanner.nextLine());

        strBuffer.reverse();
        System.out.println("Reverse String Buffer: " + strBuffer.toString());
    }
}