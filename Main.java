public class Main {
    public static void main(String[] args) {
        Employee e1 = new Manager("E001", "Mark", "HR", 15000);
        Employee e2 = new Manager("E012", "Peter", "R&D", 15000);
        Employee e3 = new Clerk("E056", "Samual", "Accounts", 10000);
        Employee e4 = new Clerk("E089", "Unknown", "Finance", 9900);

        e1.display();
        System.out.println();
        e2.display();
        System.out.println();
        e3.display();
        System.out.println();

        if (!e1.equals(e3)) {
            System.out.println(e1.getName() + " and " + e3.getName() + " have different designations.");
        }

        int[] leaveDays = {2, 3, 1, 4};
        Employee[] employees = {e1, e2, e3, e4};
        double[] deductions = new double[employees.length];

        System.out.println("\nEmployee ID  Present  Absent  Deductions");
        double totalDeductions = 0;

        for (int i = 0; i < employees.length; i++) {
            deductions[i] = employees[i].calculateDeduction(leaveDays[i]);
            totalDeductions += deductions[i];
            int presentDays = 20 - leaveDays[i];
            System.out.printf("%-12s %-8d %-6d $%.2f%n",
                    employees[i].getEmployeeID(), presentDays, leaveDays[i], deductions[i]);
        }

        System.out.println("\nTotal Deductions: $" + String.format("%.2f", totalDeductions));
    }
}



