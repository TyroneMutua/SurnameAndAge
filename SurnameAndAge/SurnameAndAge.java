import java.util.Scanner;

public class SurnameAndAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the surname
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        // Ask for the age
        System.out.print("Enter your current age: ");
        int age = scanner.nextInt();

        // Print the number of characters in the surname
        int surnameLength = surname.length();
        System.out.println("Number of characters in your surname: " + surnameLength);

        // Check if the age is even or odd
        String evenOrOdd = (age % 2 == 0) ? "even" : "odd";
        System.out.println("Your current age is an " + evenOrOdd + " number.");

    }
}
