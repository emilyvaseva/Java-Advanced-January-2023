package P04StreamsFilesAndDirectories;

import java.io.*;

public class P03CopyBytes {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\HP\\Desktop\\Java Advanced\\src\\P04StreamsFilesAndDirectories\\Resources";
        String inputPath = basePath + "\\input.txt";
        String outPutPath = basePath + "\\copyOutput.txt";

        try (InputStream inputStream = new FileInputStream(inputPath);
                OutputStream outputStream = new FileOutputStream(outPutPath)) {
            int readByte = inputStream.read();
            while (readByte >= 0) {
                if (readByte == ' ' || readByte == '\n') {
                    outputStream.write(readByte);
                }else {
                    String number = String.valueOf(readByte);
                    for (int i = 0; i < number.length(); i++) {
                        outputStream.write(number.charAt(i));
                    }
                }
                readByte = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
