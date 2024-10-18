import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MarksWriter {

    public static void main(String[] args) {
        String fileName = "Marks.data";

        try (BufferedWriter Writer = new BufferedWriter(new FileWriter(fileNamenull))) {
            for (int i =1; i<= 20; i++) {
                int mark = (int) (Math.random() * 101);
                Writer.Write("Mark" + i + ":" + mark);
                Writer.newLine();
            }
            System.out.println("20 marks Written to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}