import java.util.Scanner;
import java.util.ArrayList;

public class FifthItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string (or press Enter to finish):");
            String input = sc.nextLine();

            if (input.isEmpty()) {
            break;
            }
            list.add(input);
        }
        if (list.size() >=5) {
            System.out.println ("The fifth string entered was : "+list.get(4));
        } else {
            System.out.println ("You did not enter enough strings");
        }

    }
}
