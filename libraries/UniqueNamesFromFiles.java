import java.nio.file.*;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueNamesFromFiles {
    public static void main(String[] args) throws IOException {

        List<String> names1 = Files.readAllLines(Paths.get("names1.txt"));
        List<String> names2 = Files.readAllLines(Paths.get("names2.txt"));

    
        Set<String> uniqueNames = new LinkedHashSet<>();
        uniqueNames.addAll(names1);
        uniqueNames.addAll(names2); 

    
        uniqueNames.forEach(System.out::println);
    }
}

