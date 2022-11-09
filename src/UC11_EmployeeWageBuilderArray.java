public class UC11_EmployeeWageBuilderArray implements EmployeeWage {

    // Constants for Class

    private int noOfCompanies = 0;
    private CompanyEmpWage[] companyEmpWages;

    public void UC11_EmployeeWageBuilderArray() {
        companyEmpWages = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWages(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        companyEmpWages[noOfCompanies] = new CompanyEmpWage(companyName, wagePerHr, numWorkingDays, maxHrsPerMonth);
        noOfCompanies++;
        return;
    }

    public void calculateEmpWage() {
        for (int i = 0; i < noOfCompanies; i++) {
            companyEmpWages[i].setTotalEmpWage(calculateEmpWage(companyEmpWages[i]));
            System.out.println(companyEmpWages[i].toString());
        }
    }

    // Method to calculate employee Wage by hours and Type

    public int calculateEmpWage(CompanyEmpWage companyEmpWage) {

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
        UC11_EmployeeWageBuilderArray UC11_EmployeeWageBuilderArray = new UC11_EmployeeWageBuilderArray();
        UC11_EmployeeWageBuilderArray.addCompanyEmpWages("Accenture", 200, 24, 100);
        UC11_EmployeeWageBuilderArray.addCompanyEmpWages("Wipro", 300, 26, 150);
        UC11_EmployeeWageBuilderArray.calculateEmpWage();
    }
}

