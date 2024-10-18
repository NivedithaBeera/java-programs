import java.io.IOException;
import java.nio.file.*;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Please provide the file path.");
            return;
        }

        
        Path filePath = Paths.get(args[0]);

        
        String content = Files.readString(filePath);

        
        String updatedContent = content.replaceAll("\\s+", " ");

        Files.writeString(filePath, updatedContent);

        System.out.println("Replaced multiple spaces with a single space.");
    }
}

