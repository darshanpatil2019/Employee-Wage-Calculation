import java.util.ArrayList;

public class UC12_EmployeeWageBuilderArrayList implements EmployeeWage {
    // Constants for Class

    private int noOfCompanies = 0;
   //Array List for Company Wage Object
   static ArrayList<CompanyEmpWage> CompanyEmpWages;


    public static void UC12_EmployeeWageBuilderArrayList() {
        CompanyEmpWages = new ArrayList<>();
    }

    private static void addCompanyEmpWages(String companyName, int wagePerHr, int numWorkingDays, int maxHrsPerMonth) {
        CompanyEmpWages.add(new CompanyEmpWage(companyName, wagePerHr, numWorkingDays, maxHrsPerMonth));
    }

    public void calculateEmpWage() {
        for (CompanyEmpWage companyEmpWage : CompanyEmpWages) {
            companyEmpWage.setTotalEmpWage(this.calculateEmpWage(companyEmpWage));
            System.out.println(companyEmpWage.toString());
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
        UC12_EmployeeWageBuilderArrayList uc12_employeeWageBuilderArrayList= new UC12_EmployeeWageBuilderArrayList();
        UC12_EmployeeWageBuilderArrayList.addCompanyEmpWages("Accenture", 200, 24, 100);
        UC12_EmployeeWageBuilderArrayList.addCompanyEmpWages("Wipro", 300, 26, 150);
        UC12_EmployeeWageBuilderArrayList.addCompanyEmpWages("INFOSYS",500,28,250);
        UC12_EmployeeWageBuilderArrayList.calculateEmpWage();
    }
}

