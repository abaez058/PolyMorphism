public class Manager extends Employee {
    public Manager(String employeeID, String name, String department, double salary) {
        super(employeeID, name, department, salary, "Manager");
    }


    public double addBonus() {
        return salary + 300;
    }


    public double calculateDeduction(int absentDays) {
        return ((super.salary + 300) / 20) * absentDays;
    }
}