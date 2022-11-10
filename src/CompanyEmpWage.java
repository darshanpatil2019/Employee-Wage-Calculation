public class CompanyEmpWage {
    //Instance Variables

    public String companyName;
    public int wagePerHr;
    public int numWorkingDays;
    public int maxHrsPerMonth;
    public int totalEmpWage;

    //Parameterized Constructor for Initializing the Variables

    public CompanyEmpWage(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }
    //Override toString() from String Class

    public String toString() {
        return "Total Employee Wage for Company : " + companyName + "is :" + totalEmpWage;
    }
}
