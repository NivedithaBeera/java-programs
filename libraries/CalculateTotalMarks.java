import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CalculateTotalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename (e.g., Marks.txt): ");
        String filename = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                String[] marks = line.split(","); 
                int totalMarks = 0;

                for (String mark : marks) {
                    try {
                    
                        totalMarks += Integer.parseInt(mark.trim());
                    } catch (NumberFormatException e) {
                    
                        System.out.println("Warning: Invalid mark '" + mark.trim() + "' at line " + lineNumber + ". Skipping...");
                    }
                }

                System.out.println("Total marks for line " + lineNumber + ": " + totalMarks);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

