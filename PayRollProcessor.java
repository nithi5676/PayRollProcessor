package payRollProcessor;

class PayRoll {
    public String name;

    void calculatPay() {
    }
}

class SalariedEmployee extends PayRoll {
    long salary;

    @Override
    void calculatPay() {
        super.calculatPay();
        System.out.println(name + " monthly salary  is " + this.salary);
    }

}

class HourlyEmployee extends PayRoll {
    double hourlyRate;
    double hoursWorked;

    @Override
    void calculatPay() {
        super.calculatPay();
        System.out.printf(name + " Hourly Salary  is " + "%.2f", hourlyRate * hoursWorked);
    }
}

public class PayRollProcessor {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        salariedEmployee.name = "Nithish";
        salariedEmployee.salary = 250000;
        hourlyEmployee.hourlyRate = 25.5;
        hourlyEmployee.name = "Sham";
        hourlyEmployee.hoursWorked = 40;
        salariedEmployee.calculatPay();
        hourlyEmployee.calculatPay();
    }
}
