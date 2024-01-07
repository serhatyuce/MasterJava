package inheritance.inheritance_challenge;

public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(int employeNo, String name, String birthDate, long employeeId, String hireDate, double hourlyPayRate) {
        super(employeNo, name, birthDate, employeeId, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return hourlyPayRate * 40;
    }
    public double getDoublePay(){
        return 2*collectPay();
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRAte=" + hourlyPayRate +
                "} " + super.toString();
    }
}
