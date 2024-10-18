import java.util.Scanner;
import java.util.ArrayList;

public class NamesSeparator {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);

        
        ArrayList<String> names = new ArrayList<>();

    
        String name;

    
        System.out.println("Enter names one by one. Type 'END' to finish:");
        while (true) {
            name = input.nextLine();
            if (name.equalsIgnoreCase("END")) {
                break; 
            }
            names.add(name); 
        }

    
        System.out.println("\nNames separated by '-':");
        System.out.println(String.join("-", names));

        input.close();
    }
}

