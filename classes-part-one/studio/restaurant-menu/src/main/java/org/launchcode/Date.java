package org.launchcode;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Date {
    public static LocalDate main(String[] args) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM dd, YYYY");

        return localDate;
    }
}
