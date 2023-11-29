import java.util.Scanner;

public class Amanlikesmoney {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for their age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Print out the name and age
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
