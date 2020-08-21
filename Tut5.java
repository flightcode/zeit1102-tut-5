import java.util.*;

public class Tut5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] data = new int[100];
        int input = 0;
        int i = 0;

        System.out.println("Input numbers (Input 100 numbers or '-1' to end):");
        for (i = 0; i < 100; i++) {
            input = scan.nextInt();
            if (input == -1) {
                break;
            }
            data[i] = input;
        }

        System.out.println("Numbers in Array:");
        for (int j = 0; j < i; j++) {
            System.out.print(data[j] + " ");
        }
        System.out.println("");

        System.out.print("Input Number to Search: ");
        input = scan.nextInt();

        boolean found = false;
        for (int j = 0; j < i; j++) {
            if (data[j] == input) {
                found = true;
                break;
            }
        }

        if (found == true) {
            System.out.println("Number In Array");
        } else {
            System.out.println("Number NOT In Array");
        }
    }
}