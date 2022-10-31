public class UC4_SwitchCase {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE_PER_HR = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3; //computing employee check-type casted

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
        System.out.println("Employee wage is: " + empWage);
    }
}
