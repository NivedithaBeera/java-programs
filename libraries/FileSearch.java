import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the directory path: ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter the string to search for: ");
        String searchString = scanner.nextLine();

        
        searchFiles(new File(directoryPath), searchString);

        scanner.close();
    }

    
    private static void searchFiles(File directory, String searchString) {
        
        if (!directory.isDirectory()) {
            System.out.println("The provided path is not a directory.");
            return;
        }

    
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    
                    if (containsString(file, searchString)) {
                        System.out.println("Found in: " + file.getAbsolutePath());
                    }
                }
            }
        } else {
            System.out.println("No files found in the directory.");
        }
    }

    
    private static boolean containsString(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    return true; 
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getAbsolutePath());
        }
        return false; 
    }
}

