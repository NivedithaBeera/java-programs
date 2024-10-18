public class Person {
    private String name;
    private int age;
    private String email;


    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age &&
                name.equals(person.name) &&
                email.equals(person.email);
    }


    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + email.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "john.doe@example.com");
        Person person2 = new Person("John Doe", 30, "john.doe@example.com");
        Person person3 = new Person("Jane Smith", 25, "jane.smith@example.com");


        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false

        
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

    
        System.out.println(person1.toString());
        System.out.println(person3.toString());
    }
}

