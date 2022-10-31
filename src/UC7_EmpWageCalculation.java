class EmployeeWageCalculation {
    //Constants(final)
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_MAX_WORK_DAYS = 20;
    public static final int NUM_OF_MAX_WORK_HRS = 100;

    //Variables
    int empHrs = 0;
    static int totalEmpHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;
    static int totalWorkingDays = 0;

    private void checkEmpType() {           // method to check employee type
        double empCheck = Math.floor(Math.random() * 10) % 3;
        switch ((int) empCheck) {
            case IS_FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Present for Full Time");
                break;
            case IS_PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Present for Part Time");
                break;
            default:
                empHrs = 0;
                System.out.println("Employee is Absent");
                break;
        }
    }

    private void empWageCalculation() {       //method to calculate employee wage
        totalEmpHrs = totalEmpHrs + empHrs;
        empWage = empHrs * EMP_RATE_PER_HR;
        totalEmpWage = totalEmpWage + empWage;
        System.out.println("Employee wage is: " + empWage);
        System.out.println("Days:" + totalWorkingDays + "\t Total Hours:" + totalEmpHrs);
    }

    public static void main(String[] args) {

        EmployeeWageCalculation eW = new EmployeeWageCalculation();

        while (totalEmpHrs <= NUM_OF_MAX_WORK_HRS && totalWorkingDays <= NUM_OF_MAX_WORK_DAYS) {
            totalWorkingDays++;

            eW.checkEmpType();           // call checkEmpType method through object of employeeWageCalculation class
            eW.empWageCalculation();    // call empWageCalculation method through object of employeeWageCalculation class
        }
        System.out.println("TOtal employee wage is: " + eW.totalEmpWage);
    }
}

