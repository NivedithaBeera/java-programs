import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNamesToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = "names.txt";

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Enter names (type 'END' to finish):");

            while (true) {
                String name = scanner.nextLine();

    
                if (name.equalsIgnoreCase("END")) {
                    break;
                }

                
                writer.write(name);
                writer.newLine();
            }

            System.out.println("Names have been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }
}

