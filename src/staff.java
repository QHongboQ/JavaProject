public class staff{
    private String name;
    private double baseSalary;
    private String dateOfHire; // (8 digits, for example, 01232010)

    public staff()
    {
        this.name = "";
        this.baseSalary = 0;
        this.dateOfHire = "";
    }

    public staff(String name, double baseSalary, String dateOfHire)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.dateOfHire = dateOfHire;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setDateOfHire(String dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getDateOfHire() {
        return dateOfHire;
    }

    // ToString
    public String toString() {
        // Example: name = Jamal Ashraf | base salary = 65852.32 | date of hire  01232010
        return "name = " + name + " | base Salary = " + baseSalary + " | date of hire " + dateOfHire;
    }
}
