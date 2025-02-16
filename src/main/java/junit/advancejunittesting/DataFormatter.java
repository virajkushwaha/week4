package junit.advancejunittesting;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataFormatter {
    private static final SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
    // method to convert yyyy-MM-dd format to dd-MM-yyyy
    public String formatDate(String inputDate) {
        try {
            // parse input date string into date object
            Date date = inputFormat.parse(inputDate);
            // format date object and return
            return outputFormat.format(date);
        } catch (Exception e) {
            return "Invalid date format";
        }
    }
    public static void main(String[] args) {
        DataFormatter dateFormatter = new DataFormatter();
        System.out.println("Formatted date: " + dateFormatter.formatDate("2025-02-15"));
        System.out.println("Formatted date: " + dateFormatter.formatDate("2024-06-10"));
    }
}
