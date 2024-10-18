import java.nio.file.*;
import java.io.IOException;
import java.util.*;

public class UniqueSortedNames {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("names.txt");

        Set<String> uniqueNames = new TreeSet<>(Files.readAllLines(path));

    
        uniqueNames.forEach(System.out::println);
    }
}

