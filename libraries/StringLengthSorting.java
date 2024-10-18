import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringLengthSorting {
    public static void main(String[] args) {
        
        Set<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lenCompare = Integer.compare(s1.length(), s2.length());
                return (lenCompare != 0) ? lenCompare : s1.compareTo(s2);  
            }
        });

        
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("kiwi");
        treeSet.add("pear");
        treeSet.add("watermelon");

    
        treeSet.forEach(System.out::println);
    }
}

    
}
