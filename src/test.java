public class test {
    public static void main(String[] args)
    {
        System.out.println("Default constructor test:");
        // Everything is null
        staff staffTest1 = new staff();
        manager managerTest1 = new manager();
        System.out.println(staffTest1);
        System.out.println("Expected: name =  | base Salary = 0.0 | date of hire ");
        System.out.println(managerTest1);
        System.out.println("Expected: name =  | base Salary = 0.0 | date of hire  | departmentName  | yearsInManagement 0");

        System.out.println();
        System.out.println("Parameter constructor test:");
        // Example: name = Jamal Ashraf | base salary = 65852.32 | date of hire  01232010
        staff staffTest2 = new staff("Jamal Ashraf", 65852.32, "01232010");
        manager managerTest2 = new manager("Jamal Ashraf", 65852.32, "01232010", "CS Department", 2000);
        System.out.println(staffTest2);
        System.out.println("Expected: name = Jamal Ashraf | base Salary = 65852.32 | date of hire 01232010");
        System.out.println(managerTest2);
        System.out.println("Expected: name = Jamal Ashraf | base Salary = 65852.32 | date of hire 01232010 | departmentName = CS Department | yearsInManagement = 2000");

        // Test for the getter and setter
        System.out.println();
        System.out.println("Accessors and Mutators test:");
        manager managerTest3 = new manager("Jamal Ashraf", 65852.32, "01232010", "CS Department", 2000);
        // setName and getName;
        managerTest3.setName("Hongbo Zhou");
        System.out.println(managerTest3.getName());
        System.out.println("Expected: Hongbo Zhou");
        // setBaseSalary and setBaseSalary
        managerTest3.setBaseSalary(2000.00);
        System.out.println(managerTest3.getBaseSalary());
        System.out.println("Expected: 2000.00");
        managerTest3.setDateOfHire("12345678");
        System.out.println(managerTest3.getDateOfHire());
        System.out.println("Expected: 12345678");
        // getDepartmentName and setDepartmentName
        managerTest3.setDepartmentName("Math Department");
        System.out.println(managerTest3.getDepartmentName());
        System.out.println("Expected: Math Department");
        managerTest3.setYearsInManagement(1234);
        System.out.println(managerTest3.getYearsInManagement());
        System.out.println("Expected: 1234");
    }
}
