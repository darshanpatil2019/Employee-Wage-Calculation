public class UC1_EmpAttendance {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2; //computing employee check

        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
