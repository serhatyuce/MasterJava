package inheritance.inheritance_challenge;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private int employeeNo;

    public Employee(int employeNo, String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeNo = employeNo;
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeNo +
                ", hireDate='" + hireDate + '\'' +
                ", employeeNo=" + employeeId +
                "} " + super.toString();
    }
}
