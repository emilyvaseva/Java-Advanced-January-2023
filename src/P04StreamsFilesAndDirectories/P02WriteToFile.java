package P04StreamsFilesAndDirectories;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class P02WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String basePath="C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectories\\Resources";
        String inputPath = basePath+"\\input.txt";
        String outPutPath = basePath+"\\output.txt";

        List<Character> punctuation= Arrays.asList(',', '.', '!', '?');
        OutputStream outputStream = new FileOutputStream(outPutPath);

        try(InputStream inputStream = new FileInputStream(inputPath)){
            int readByte = inputStream.read();

            while (readByte>=0){
                if (!punctuation.contains((char)readByte)){
                    outputStream.write(readByte);
                }
                readByte=inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
