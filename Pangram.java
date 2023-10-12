import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
        // Create a set to store encountered letters
        Set<Character> letters = new HashSet<>();

        // Convert the input to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Iterate through the characters in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        // Check if all 26 letters from 'a' to 'z' are present
        return letters.size() == 26;
    }
}
