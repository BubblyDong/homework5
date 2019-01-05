
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class random {

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 2; j++) {
                try {
                    String data = Integer.toString(new Random().nextInt(50));

                    File file = new File("Instance.txt");
                    if (!file.exists()) {
                        file.createNewFile();
                    }
                    FileWriter fileWritter = new FileWriter(file.getName(), true);
                    BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                    if(j==0)
                        bufferWritter.write(data+",");
                    else
                        bufferWritter.write(data);
                    bufferWritter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                File file = new File("Instance.txt");
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fileWritter = new FileWriter(file.getName(), true);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write("\n");
                bufferWritter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}