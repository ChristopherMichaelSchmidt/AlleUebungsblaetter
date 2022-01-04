package UeStrings;

import java.util.Arrays;

public class CSVParser {
    private String csvline;


    public CSVParser(String csvline) {
        this.csvline = csvline;
    }

    public int countComma() {
        int count = 0;
        for (int i = 0; i < csvline.length(); i++) {
            if (csvline.charAt(i) == ',') {
                count++;
            }

        }
        return count;

    }
    public String[] parse(){
        String[] hilf = csvline.split(",");
        return hilf;


    }
}
