import java.util.*;

public class Tut5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] data = new int[100];
        int input = 0;
        int i = 0;

        for (i = 0; i < 100; i++) {
            input = scan.nextInt();
            if (input == -1) {
                break;
            }
            data[i] = input;
        }

        for (int j = 0; j < i; j++) {
            System.out.print(data[j] + " ");
        }
    }
}