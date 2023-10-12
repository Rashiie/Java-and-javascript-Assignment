//Brute Force Approach
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        shuffleArray(array);

        System.out.println("Shuffled Array: " + Arrays.toString(array));

        scanner.close();
    }

    // Function to shuffle an array
    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random rand = new Random();

        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            // Swap array[i] and array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
//Optimised Approach
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        List<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        Collections.shuffle(arrayList);

        System.out.println("Shuffled Array: " + arrayList);

        scanner.close();
    }
}

