package P04StreamsFilesAndDirectoriesExercise;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class P03AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathToFile ="C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectoriesExercise\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt"));

        /*List<String> allLines = Files.readAllLines(Path.of(pathToFile));
        for (String line:allLines){
            writer.write(line.toUpperCase());
            writer.newLine();
        }
        writer.close();*/

        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String line = reader.readLine();
        while (line!=null){
            writer.write(line.toUpperCase(Locale.ROOT));
            writer.newLine();
        }
        writer.close();
    }
}
