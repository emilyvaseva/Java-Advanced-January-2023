package P04StreamsFilesAndDirectories;

import java.io.*;

public class P05WriteEveryThirdLine {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectories\\Resources";
        String inputPath = basePath + "\\input.txt";
        String outPutPath = basePath + "\\copyOutput.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer  = new PrintStream(new FileOutputStream(outPutPath))){

            int lineCount = 1;
            String line = reader.readLine();

            while (line!=null){
                if (lineCount%3==0){
                    writer.println(line);
                }
                line= reader.readLine();
                lineCount++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
