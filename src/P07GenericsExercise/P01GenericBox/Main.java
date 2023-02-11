package P07GenericsExercise.P01GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Box<String> box = new Box<>();

        for (int i = 0; i < n; i++) {
            String element = scanner.nextLine();
            box.add(element);
        }
        System.out.println(box);
    }
}
