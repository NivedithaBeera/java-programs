import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class StringToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> validStrings = new ArrayList<>();
        String regex = "^[A-Za-z]+\\d+$"; 
        Pattern pattern = Pattern.compile(regex);

        
        System.out.println("Enter strings (type 'end' to stop):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) {
                break;
            }

    
            if (pattern.matcher(input).matches()) {
                validStrings.add(input);
            } else {
                System.out.println("Invalid string! It must be one or more alphabets followed by one or more digits.");
            }
        }

    
        Collections.sort(validStrings);

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Codes.txt"))) {
            for (String str : validStrings) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("Valid sorted strings have been written to Codes.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

    

