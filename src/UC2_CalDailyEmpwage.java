public class UC2_CalDailyEmpwage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HR = 20;

        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2; //computing employee check

        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present");
            empWage = empHrs * EMP_RATE_PER_HR;
            System.out.println("Employee wage is: " + empWage);
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }
    }
}
