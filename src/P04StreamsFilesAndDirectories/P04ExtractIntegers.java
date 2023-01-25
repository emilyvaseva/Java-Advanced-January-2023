package P04StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class P04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath = "C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectories\\Resources";
        String inputPath = basePath + "\\input.txt";
        String outPutPath = basePath + "\\copyOutput.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outPutPath));

        while (reader.hasNext()){
            if (reader.hasNextInt()){
                writer.println(reader.nextInt());
            }
            reader.next();
        }
    }
}
