package P04StreamsFilesAndDirectories;

import java.io.*;

public class P01ReadFile {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectories\\Resources\\input.txt";
        try (InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();
            while (readByte>=0){
                System.out.print(Integer.toBinaryString(readByte)+" ");

                readByte=inputStream.read();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
