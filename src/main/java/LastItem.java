import java.util.Scanner;
import java.util.ArrayList;

public class LastItem {
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

        int i = list.size() - 1;
        System.out.println ("The last item in the list was: " + list.get(i));

    }
}
