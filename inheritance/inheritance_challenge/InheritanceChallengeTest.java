package inheritance.inheritance_challenge;

public class InheritanceChallengeTest {

    public static void main(String[] args) {

        int employeNo=0;

        Employee tim = new Employee(++employeNo,"tim","1990",784512,"2015");
        System.out.println(tim);
        System.out.println(tim.getAge(2023));
        System.out.println(tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee(++employeNo,"joe", "04/04/1990",9685,"2017",35000);
        System.out.println(joe);
        System.out.println("joe's paycheck : " + joe.collectPay());
        joe.retire();
        System.out.println("joe retired paycheck : " + joe.collectPay());

        HourlyEmployee marry = new HourlyEmployee(++employeNo,"marry","09/08/1980",
                4563210,"2018",45);
        System.out.println(marry);
        System.out.println("marry paycheck : " + marry.collectPay());
        System.out.println("marry extrahours paycheck :  " + marry.getDoublePay());
    }

}
