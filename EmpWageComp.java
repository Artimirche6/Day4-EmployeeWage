public class EmpWageComp
{
	//Contants
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 2;
		public static final int MAX_HRS_IN_MONTH = 10;
		
	public static void main(String[] args)
	{	
		//Variables
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		//int empWage = 0;
		int totalEmpWage = 0;
		
		//Computation
		while ( totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		
			switch(empCheck)
			{
				case IS_FULL_TIME:
					empHrs = 8;
				break;
				case IS_PART_TIME:
					empHrs = 4;
				break;
				default:
					empHrs = 0;
				break;
			}
		
			totalEmpHrs += empHrs;
			System.out.println("Day# : "+totalWorkingDays+ " Emp Hrs : " +empHrs);
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage : "+totalEmpWage);

	}
}
