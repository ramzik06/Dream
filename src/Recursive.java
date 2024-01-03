
import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number A: ");
        int A = scanner.nextInt();

        System.out.print("Number B: ");
        int B = scanner.nextInt();

        if (A < B) {
            Ascending(A, B);
        } else {
            Descending(A, B);
        }

        scanner.close();
    }

    private static void Ascending(int c, int B) {
        if (c <= B) {
            System.out.print(c + " ");
            Ascending(c + 1, B);
        }
    }

    private static void Descending(int A, int c) {
        if (c >= A) {
            System.out.print(c + " ");
            Descending(A, c - 1);
        }
    }
}

