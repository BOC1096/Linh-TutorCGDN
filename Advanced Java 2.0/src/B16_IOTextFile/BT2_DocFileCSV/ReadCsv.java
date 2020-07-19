package B16_IOTextFile.BT2_DocFileCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static void main(String[] args) {
        String csvFile = "D:\\WORKSPACE\\Tutor_CodegymDN\\Advanced Java 2.0\\src\\B16_IOTextFile\\BT2_DocFileCSV\\data.csv";
        String line;
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
