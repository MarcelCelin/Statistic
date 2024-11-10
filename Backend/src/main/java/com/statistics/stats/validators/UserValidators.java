package com.statistics.stats.validators;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Pattern;

public class UserValidators {

    public boolean isEmailCorrect(String email) {
         final String EMAIL_REGEX = "\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";
         final Pattern pattern = Pattern.compile(
                EMAIL_REGEX,
                Pattern.CASE_INSENSITIVE);
         if(pattern.matcher(email).matches()){
             return true;
         }
         return false;
    }
    public boolean isDateOfBirthCorrect(Date dateOfBirth) {
        LocalDate localDateTime = LocalDate.now();

    }
    public void formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);

    }
}
