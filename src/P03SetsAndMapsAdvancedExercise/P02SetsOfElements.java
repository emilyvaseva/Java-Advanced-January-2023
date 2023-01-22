package P03SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sizeOfFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeOfSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        for (int i = 0; i < sizeOfFirstSet; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            firstSet.add(value);
        }
        for (int i = 0; i < sizeOfSecondSet; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            secondSet.add(value);
        }

        for (int number : firstSet) {
            if (secondSet.contains(number)){
                System.out.print(number+ " ");
            }
        }
    }
}
