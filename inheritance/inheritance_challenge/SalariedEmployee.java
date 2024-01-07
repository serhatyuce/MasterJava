package inheritance.inheritance_challenge;

public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(int employerNo,String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(employerNo,name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay(){
        double paycheck = annualSalary/26;
        double adjustPaycheck = (isRetired) ? paycheck*0.9 : paycheck ;
        return (int)adjustPaycheck;
    }

    public void retire(){
        terminate("12/12/2030");
        isRetired = true;
    }
      @Override
      public String toString() {
        return "SalariedEmployee{" +
                "annualSalary = " + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
