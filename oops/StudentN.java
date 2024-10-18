public class StudentN{
    private int adminNo;
    private String stuName;
    private String courseJoined;
    private double feesPaid;

    private static final double JAVA_FEE = 10000;
    private static final double PYTHON_FEE = 7500;

    public StudentN(int adminNo, String stuName, String courseJoined){
        this.adminNo = adminNo;
        this.stuName = stuName;
        this.courseJoined = (courseJoined.equalsIgnoreCase(courseJoined)) ? "PYHTON" : "JAVA";
        this.feesPaid = 0;
    }

    public StudentN(int adminNo,String stuName){
        this(adminNo, stuName, "java");
    }

    public double getTotalFee(){
        if (courseJoined.equals("Java")){
            return JAVA_FEE;
        }
        else if (courseJoined.equals("PYTHON")){
            return PYTHON_FEE;
        }
        return 0;
    }

    public double getDue(){
        return getTotalFee() - feesPaid;
    }

    public double getFeePaid(){
        return feesPaid;
    }

    public void payment(double amount) {
        if (amount > 0) {
            feesPaid += amount;
            if (feesPaid > getTotalFee()) {
                feesPaid = getTotalFee();
            }
        }        
}

public static void main(String[] args){
    StudentN student1 = new StudentN(101, "Alice");
    System.out.println("Student: " + student1.stuName);
    System.out.println("Course: " + student1.courseJoined);
    System.out.println("Total Fee: " + student1.getTotalFee()); 
    student1.payment(3000);
    System.out.println("Fee Paid: " + student1.getFeePaid());   
    System.out.println("Due Amount: " + student1.getDue());     

    
    StudentN student2 = new StudentN(102, "Bob", "PYTHON");
    System.out.println("\nStudent: " + student2.stuName);
    System.out.println("Course: " + student2.courseJoined);
    System.out.println("Total Fee: " + student2.getTotalFee()); 
    student2.payment(5000);
    System.out.println("Fee Paid: " + student2.getFeePaid());   
    System.out.println("Due Amount: " + student2.getDue());   
}
}
