public class UC8_EmpWageMultipleCompanies {

    // Constants

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    // Method to calculate employee Wage by hours and Type

    public static void calculateEmpWage(String company, int wagePerHr, int numWorkingDays, int maxHrPerMonth) {

        // local Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        // compute Emp Wage for month
        while (totalEmpHrs <= maxHrPerMonth && totalWorkingDays < numWorkingDays) {
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
        int totalEmpWage = totalEmpHrs * wagePerHr;
        System.out.println("Total Employee Wage for Company : " + company + " is : " + totalEmpWage);
    }

    public static void main(String[] args) {

        calculateEmpWage("Wipro", 300, 20, 30);
        calculateEmpWage("Accenture", 500, 25, 40);
    }
}

