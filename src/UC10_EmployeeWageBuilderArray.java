public class UC10_EmployeeWageBuilderArray {

    // Constants for Class

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private static int noOfCompanies = 0;
    private static CompanyEmpWage[] companyEmpWages;

    public UC10_EmployeeWageBuilderArray() {
        companyEmpWages = new CompanyEmpWage[5];
    }

    private static void addCompanyEmpWages(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        companyEmpWages[noOfCompanies] = new CompanyEmpWage(companyName, wagePerHr, numWorkingDays, maxHrsPerMonth);
        noOfCompanies++;
        return;
    }

    private static void calculateEmpWage() {
        for (int i = 0; i < noOfCompanies; i++) {
            companyEmpWages[i].setTotalEmpWage(calculateEmpWage(companyEmpWages[i]));
            System.out.println(companyEmpWages[i].toString());
        }
    }

    // Method to calculate employee Wage by hours and Type

    public static int calculateEmpWage(CompanyEmpWage companyEmpWage) {

        // local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        // compute Emp Wage for month
        while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.numWorkingDays) {
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
        return totalEmpHrs * companyEmpWage.wagePerHr;
    }

    public static void main(String[] args) {
        UC10_EmployeeWageBuilderArray uc10_employeeWageBuilderArray = new UC10_EmployeeWageBuilderArray();
        UC10_EmployeeWageBuilderArray.addCompanyEmpWages("Accenture", 200, 24, 100);
        UC10_EmployeeWageBuilderArray.addCompanyEmpWages("Wipro", 300, 26, 150);
        UC10_EmployeeWageBuilderArray.calculateEmpWage();
    }
}

