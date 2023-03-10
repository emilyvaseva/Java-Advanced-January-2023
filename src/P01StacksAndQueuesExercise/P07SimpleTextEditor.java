package P01StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommand=Integer.parseInt(scanner.nextLine());
        StringBuilder currentText=new StringBuilder();

        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 1; i <=countCommand ; i++) {
            String command = scanner.nextLine();
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]);
            switch (commandNumber){
                case 1:
                    textStack.push(currentText.toString());
                    String stringForAppend = command.split("\\s+")[1];
                    currentText.append(stringForAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsForDelete=Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = currentText.length() - countElementsForDelete;
                    currentText.delete(startIndex,startIndex+countElementsForDelete);
                    break;
                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(currentText.charAt(index-1));
                    break;
                case 4:
                    if (!textStack.isEmpty()){
                        currentText=new StringBuilder(textStack.pop());
                    }

                    break;
            }
        }
    }
}
