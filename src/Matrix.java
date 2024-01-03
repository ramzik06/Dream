
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[3][2];
        int[][] arr2 = new int[3][2];
        System.out.println("Matrix 1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        int[][] sumarr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                sumarr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum of Matrix 1 and Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sumarr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] mularr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                mularr[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println("Multiply of Matrix 1 and Matrix 2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(mularr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

