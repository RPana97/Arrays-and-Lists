import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList {
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
        int sum = sumOfList(list);
        for (int i =0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println("were the items in the list. The sum of the list is: "+sum);
    }

    public static int sumOfList(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}