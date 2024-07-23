import java.util.Scanner;
import java.util.ArrayList;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter integers (or enter 0 to finish):");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            list.add(input);
        }

       System.out.println ("Enter the number you are looking for: ");
        int number = sc.nextInt();
        int index = list.indexOf(number);
        if (index != -1) {
            System.out.println ("The number, " + number + " is found at index " + index);
        } else {
            System.out.println ("The number, " + number + " is not found");
        }

    }
}
