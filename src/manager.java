public class manager extends staff
{
    private String departmentName;
    private int yearsInManagement;

    public manager()
    {
        super();
        departmentName = "";
        yearsInManagement = 0;
    }

    public manager(String name, double baseSalary, String dateOfHire, String departmentName, int yearsInManagement)
    {
        super(name, baseSalary, dateOfHire);
        this.departmentName = departmentName;
        this.yearsInManagement = yearsInManagement;
    }

    // Mutator
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setYearsInManagement(int yearsInManagement) {
        this.yearsInManagement = yearsInManagement;
    }

    // Accessor
    public String getDepartmentName() {
        return departmentName;
    }

    public int getYearsInManagement() {
        return yearsInManagement;
    }


    @Override
    public String toString() {
        return "name = " + getName() + " | base Salary = " + getBaseSalary() + " | date of hire " + getDateOfHire() + " | departmentName = " + departmentName + " | yearsInManagement = " + yearsInManagement;
    }
}
