package P09ExamPreparation.P01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liquidInfo = scanner.nextLine().split(" ");
        Deque<Integer> liquids = new ArrayDeque<>();

        for (String liquid:liquidInfo){
            liquids.offer(Integer.parseInt(liquid));
        }

        String[] ingredientsInfo = scanner.nextLine().split(" ");
        Deque<Integer> ingredients = new ArrayDeque<>();
        for (String ingredient:ingredientsInfo){
            ingredients.push(Integer.parseInt(ingredient));
        }

        int biscuitCount = 0;
        int cakeCount = 0;
        int pastryCount = 0;
        int pieCount = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()){
            Integer liquid = liquids.poll();
            Integer ingredient = ingredients.pop();
            int possibleDish = liquid+ingredient;

            switch (possibleDish){
                case 25:
                    biscuitCount++;
                    break;
                case 50:
                    cakeCount++;
                    break;
                case 75:
                    pastryCount++;
                    break;
                case 100:
                    pieCount++;
                    break;
                default:
                    ingredients.push(ingredient+3);
                    break;
            }
        }
        if (biscuitCount>0 && cakeCount>0 && pastryCount>0 &&pieCount>0){
            System.out.println("Great! You succeeded in cooking all the food!");
        }else {
            System.out.println("What a pity! You didn't have enough materials to cook everything");
        }

        System.out.print("Liquids left: ");
        if (liquids.isEmpty()){
            System.out.println("none");
        }else {
            System.out.println(liquids.toString().replaceAll("[\\[\\]]",""));
        }

        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()){
            System.out.println("none");
        }else {
            System.out.println(ingredients.toString().replaceAll("[\\[\\]]",""));
        }

        System.out.printf("Biscuit: %d\nCake: %d\nPie: %d\nPastry: %d\n",
                biscuitCount,cakeCount,pieCount,pastryCount);
    }
}
