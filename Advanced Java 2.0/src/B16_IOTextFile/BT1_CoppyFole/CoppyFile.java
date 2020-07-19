package B16_IOTextFile.BT1_CoppyFole;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) {
        File inputFile = new File("D:\\WORKSPACE\\Tutor_CodegymDN\\Advanced Java 2.0\\src\\B16_IOTextFile\\BT1_CoppyFole\\input.txt");
        File outputFile = new File("D:\\WORKSPACE\\Tutor_CodegymDN\\Advanced Java 2.0\\src\\B16_IOTextFile\\BT1_CoppyFole\\output.txt");

        if (!inputFile.exists() && outputFile.exists()) {
            System.out.println("Source file doesn't exist and Destination file exists.");
        }

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter(outputFile)));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
