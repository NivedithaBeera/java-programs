import java.util.Scanner;

public class MarksTotal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter marks separated by commas (e.g., 85,90,78): ");
        String marksInput = input.nextLine();

    
        String[] marksArray = marksInput.split(",");

        int total = 0;

        
        for (String mark : marksArray) {
            total += Integer.parseInt(mark.trim()); 
        }


        System.out.println("Total marks: " + total);

        
        input.close();
    }
}
