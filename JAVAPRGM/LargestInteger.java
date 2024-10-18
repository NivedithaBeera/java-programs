import java.util.Arrays;
import java.util.List;
public class LargestInteger{
    public static void main(String[] args) {
        List<Integer> arrayList = Array.asList(5,1093,1066,12,118,31);
        int maxValue = arrayList.stream()
                             .max(Integer::compareTO)
                             .get();
        System.out.println("The maximum value is" + maxvalue);
    }
}