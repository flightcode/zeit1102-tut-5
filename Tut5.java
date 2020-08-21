import java.util.*;

public class Tut5 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] data = new int[100];
        int input = 0;

        for (int i = 0; i < 100 && input != -1; i++) {
            input = scan.nextInt();
            if (input == -1) {
                break;
            }
            data[i] = input;
        }
    }
}