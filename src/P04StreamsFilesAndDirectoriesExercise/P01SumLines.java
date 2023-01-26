package P04StreamsFilesAndDirectoriesExercise;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class P01SumLines {
    public static void main(String[] args) throws IOException {
        String pathToFile = "C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(pathToFile));

        /*for (String line:allLines){
            int sum = 0;
            for (char symbol:line.toCharArray()){
                sum+=(int) symbol;
            }
            System.out.println(sum);
        }*/

        allLines.forEach(line->{
            int sum = 0;
            for(char symbol:line.toCharArray()){
                sum+=(int)symbol;
            }
            System.out.println(sum);
        });
    }
}
