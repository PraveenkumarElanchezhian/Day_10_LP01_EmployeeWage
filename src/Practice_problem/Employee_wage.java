package Practice_problem;

public class Employee_wage {
	public static final int EMP_FULL_TIME_HOUR = 1;
    public static final int EMP_PART_TIME_HOUR = 2;
    public static void main(String[] args) {
    	computeEmpWage("TCS", 20, 2, 10);
        computeEmpWage("CTS", 10, 4, 20);
}
    private static void computeEmpWage(String company, int EMP_WAGE_PER_HOUR, int NUM_WORKING_DAY, int EMP_MONTHLY_WORKING_HOUR) {
    	int empHours;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= EMP_MONTHLY_WORKING_HOUR && totalWorkingDays < NUM_WORKING_DAY) {
          totalWorkingDays++;
            int empCheck = (int)(Math.floor(Math.random()*10)%3);
            switch (empCheck)
            {
                case EMP_FULL_TIME_HOUR: {
                            empHours = 8;
                            System.out.println("Employee is present for full time");
                            break;
                }
                case EMP_PART_TIME_HOUR: {
                            empHours = 4;
                            System.out.println("Employee is present for half time");
                            break;
                }
                default: {
                      empHours = 0;
                      System.out.println("Employee is absent");
                      break;
                        }
            }
            totalEmpHrs += empHours;
            System.out.println("Day:" + totalWorkingDays +" " + " Employee work Hrs: " + empHours);
        }
        int totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Total Emp Wage For Company  = " + company + " is: " + totalEmpWage);
	}
}