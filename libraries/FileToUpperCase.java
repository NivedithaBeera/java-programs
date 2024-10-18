import java.nio.file.*;
import java.io.IOException;

public class FileToUpperCase {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Please provide a file path.");
            return;
        }
        
        Path path = Paths.get(args[0]);
        String content = Files.readString(path);  
        Files.writeString(path, content.toUpperCase());  
        System.out.println("File content converted to uppercase.");
    }
}
