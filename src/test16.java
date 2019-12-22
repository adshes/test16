import java.io.*;

public class test16 {

    public static void main(String[] args) {
        try {
            File file = new File("/Users/Юзер/Desktop/test.txt");

            FileReader fr = new FileReader(file);

            BufferedReader reader = new BufferedReader(fr);

            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);

                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

