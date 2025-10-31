public class Clerk extends Employee {
    public Clerk(String employeeID, String name, String department, double salary) {
        super(employeeID, name, department, salary, "Clerk");
    }


    public double addBonus() {
        return salary + 100;
    }


    public double calculateDeduction(int absentDays) {
        return ((salary + 100) / 20) * absentDays;
    }
}
