import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Circle implements Comparable<Circle> {
    int x, y, radius;

    
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y && radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    
    @Override
    public int compareTo(Circle other) {
        if (this.radius != other.radius)
            return this.radius - other.radius;
        if (this.x != other.x)
            return this.x - other.x;
        return this.y - other.y;
    }


    @Override
    public String toString() {
        return "Circle(" + "x=" + x + ", y=" + y + ", radius=" + radius + ")";
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Set<Circle> hashSet = new HashSet<>();
        Set<Circle> treeSet = new TreeSet<>();

    
        Circle c1 = new Circle(0, 0, 5);
        Circle c2 = new Circle(1, 1, 3);
        Circle c3 = new Circle(2, 2, 5);
        Circle c4 = new Circle(0, 0, 5);  


        hashSet.add(c1);
        hashSet.add(c2);
        hashSet.add(c3);
        hashSet.add(c4); 

        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);  

        System.out.println("HashSet contents (unordered, no duplicates):");
        hashSet.forEach(System.out::println);

        System.out.println("\nTreeSet contents (sorted, no duplicates):");
        treeSet.forEach(System.out::println);
    }
}

