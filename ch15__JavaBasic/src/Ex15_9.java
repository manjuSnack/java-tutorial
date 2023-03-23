
// #15.22 FileReader와 FileWriter
import static java.lang.System.*;
import java.io.*;

public class Ex15_9 {
    public static void main(String[] args) {
        // cmd에서 java Ex15_9 Ex15_9.java convert.txt로 작성해 실행할 것
        try {
            FileReader fr = new FileReader(args[0]);
            FileWriter fw = new FileWriter(args[1]);

            int data = 0;
            while ((data = fr.read()) != -1) {
                if (data != '\t' && data != '\n' && data != ' ' && data != '\r')
                    fw.write(data);
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
