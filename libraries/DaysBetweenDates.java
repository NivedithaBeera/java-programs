import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

    
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Enter the starting date (DD-MM-YYYY): ");
        String startDateInput = input.nextLine();

        System.out.print("Enter the ending date (DD-MM-YYYY): ");
        String endDateInput = input.nextLine();

        LocalDate startDate = LocalDate.parse(startDateInput, formatter);
        LocalDate endDate = LocalDate.parse(endDateInput, formatter);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);


        System.out.println("Number of days between " + startDateInput + " and " + endDateInput + " is: " + daysBetween);

        input.close();
    }
}

