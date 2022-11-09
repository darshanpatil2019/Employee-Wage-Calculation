public class UC9_SaveEmpWageMultipleCompanies {

    // Constants

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    //Instance Variables
    private String companyName;
    private int wagePerHr;
    private int numWorkingDays;
    private int maxHrsPerMonth;
    private int totalEmpWage;

    //Parameterized Constructor for Initializing Variables

    public UC9_SaveEmpWageMultipleCompanies(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        this.companyName = companyName;
        this.wagePerHr = wagePerHr;
        this.numWorkingDays = numWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
    }
    // Method to calculate employee Wage by hours and Type

    public void calculateEmpWage() {

        // local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        // compute Emp Wage for month
        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numWorkingDays) {
            totalWorkingDays++;  //Incrementing working days
            double empCheck = Math.floor(Math.random() * 30) % 3;

            switch ((int) empCheck) {
                case IS_PART_TIME:
                    System.out.println("Employee is Present as PART TIME");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    System.out.println("Employee is Present as Full Time");
                    empHrs = 8;
                    break;
                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day No :" + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
         totalEmpWage = totalEmpHrs * wagePerHr;
    }
    @Override
            public String toString(){
        return "Total Employee Wage for Company : " + companyName + " is : " + totalEmpWage;
    }

    public static void main(String[] args) {
        UC9_SaveEmpWageMultipleCompanies Accenture = new UC9_SaveEmpWageMultipleCompanies("Accenture", 300, 24, 90);
        UC9_SaveEmpWageMultipleCompanies Wipro = new UC9_SaveEmpWageMultipleCompanies("Wipro", 200, 21, 100);
        Accenture.calculateEmpWage();
        System.out.println(Accenture.toString());
        Wipro.calculateEmpWage();
        System.out.println(Wipro.toString());
    }
}

