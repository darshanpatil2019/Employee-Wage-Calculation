public class UC6_MaxHrsMaxDays {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int NUM_OF_MAX_WORK_DAYS = 20;
    public static final int NUM_OF_MAX_WORK_HRS = 100;

    public static void main(String[] args) {

        int empHrs = 0, totalEmpHrs = 0;
        int empWage = 0, totalEmpWage = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= NUM_OF_MAX_WORK_HRS && totalWorkingDays <= NUM_OF_MAX_WORK_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

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
            totalEmpHrs = totalEmpHrs + empHrs;
            empWage = empHrs * EMP_RATE_PER_HR;
            totalEmpWage = totalEmpWage + empWage;
            System.out.println("Employee wage is: " + empWage);
            System.out.println("Days:" + totalWorkingDays + "\t Total Hours:" + totalEmpHrs);
        }
        System.out.println("Total Employee wage for month is: " + totalEmpWage);
    }
}
