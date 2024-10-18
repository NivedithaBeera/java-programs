class Employee {
    protected int empId;
    protected String empName;
    protected double salary;

    public Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeeInfo() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
    }
}

public class FactoryEmployee extends Employee {
    private String busNo;
    private boolean empBoards;

    public FactoryEmployee(int empId, String empName, double salary, String busNo, boolean empBoards) {
        super(empId, empName, salary);
        this.busNo = busNo;
        this.empBoards = empBoards;
    }

    public String getBusNo() {
        return busNo;
    }

    public boolean doesEmpBoard() {
        return empBoards;
    }

    @Override
    public void displayEmployeeeInfo() {
        super.displayEmployeeeInfo();
        System.out.println("Bus No: " + busNo);
        System.out.println("Employee Boards Bus: " + (empBoards ? "Yes" : "no"));
    }

    public static void main(String[] args){

        FactoryEmployee factoryEmployee = new FactoryEmployee(101, "John Doe", 50000.0,"s-4",true);
        factoryEmployee.displayEmployeeeInfo();
    }
}
