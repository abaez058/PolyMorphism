public class Employee {
    protected String employeeID;
    protected String name;
    protected String department;
    protected double salary;
    protected String designation;

    public Employee(String employeeID, String name, String department, double salary, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.designation = designation;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public double addBonus() {
        return salary + 200;
    }


    public boolean equals(Employee obj) {
        return this.employeeID.equals(obj.employeeID)
                && this.name.equals(obj.name)
                && this.department.equals(obj.department)
                && this.salary == obj.salary
                && this.designation.equals(obj.designation);
    }
    public double calculateDeduction(int absentDays) {
        return (salary / 20) * absentDays;
    }

    public void display() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Employee name : " + name);
        System.out.println("Department name : " + department);
        System.out.println("Salary : " + salary);
        System.out.println("Designation : " + designation);
        System.out.println("Salary after adding the bonus is : " + addBonus());
    }
}
