class Employee{
    protected int empId;
    protected String empName;
    protected souble salary;

    public Employee(int empId, String empName, double salary){
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void displayEmployeeDetails(){
        System.out.println("Emplpyee ID: + empId");
        System.out.println("Emplouee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}
class FactoryEmployee extends Employee {
    private String busNo;
    private boolean empBoards;

    public FactoryEmployee(int empId, String empName, double salary, String busNo, boolean empBoards) {
        super(empId, empName, salary); 
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bus No: " + busNo);
        System.out.println("Boards the Bus: " + (empBoards ? "Yes" : "No"));
    }

    public void updateBusDetails(String newBusNo, boolean doesBoard) {
        this.busNo = newBusNo;
        this.empBoards = doesBoard;
        System.out.println("Bus details updated.");
    }

    public void getBusDetails() {
        System.out.println("Bus No: " + busNo);
        System.out.println("Boards the Bus: " + (empBoards ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        FactoryEmployee factoryEmp = new FactoryEmployee(101, "John Doe", 30000, "Bus12", true);
        factoryEmp.displayEmployeeDetails();

        System.out.println("\nUpdating bus details...");
        factoryEmp.updateBusDetails("Bus24", false);
        factoryEmp.getBusDetails();
    }
}








