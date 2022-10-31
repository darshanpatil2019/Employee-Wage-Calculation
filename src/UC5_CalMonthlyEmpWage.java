public class UC5_CalMonthlyEmpWage {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_MAX_WORK_DAYS = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3; //computing employee check-type cast

        for (int day = 0; day <= NUM_OF_MAX_WORK_DAYS; day++) {

            switch (empCheck) {
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
            }
            empWage = empHrs * EMP_RATE_PER_HR;
            totalEmpWage = totalEmpWage + empWage;                      //totalEmpWage += empWage;
            System.out.println("Employee wage is: " + empWage);
        }
        System.out.println("Total Employee wage for month is: " + totalEmpWage);
    }
}
