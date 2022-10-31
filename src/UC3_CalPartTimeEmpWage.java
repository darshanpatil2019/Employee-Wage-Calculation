public class UC3_CalPartTimeEmpWage {

    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HR = 20;

        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3; //computing employee check

        if (empCheck == IS_FULL_TIME) {
            empHrs = 8;
            System.out.println("Employee is Present for Full Time");
        } else if (empCheck == IS_PART_TIME) {
            empHrs = 4;
            System.out.println("Employee is Present for Part Time");
        } else {
            empHrs = 0;
            System.out.println("Employee is Absent");
        }
        empWage = empHrs * EMP_RATE_PER_HR;
        System.out.println("Employee wage is: " + empWage);
    }
}

