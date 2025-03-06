package assignments;

public class Assignment3_EmpGroups {

	String [] employees = new String[3];
	int [] empID = new int[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initializing the object of Employees Class
		Assignment3_Employees empDetails = new Assignment3_Employees();
		
		//Initializing the object of EmpGroups Class
		Assignment3_EmpGroups empGroups = new Assignment3_EmpGroups();
		
		//Retrieving the Employee IDs data from Employees class and storing in Emp Groups class - array
		empGroups.empID[0] = empDetails.empID1;
		empGroups.empID[1] = empDetails.empID2;
		empGroups.empID[2] = empDetails.empID3;
		
		//Retrieving the Employee IDs data from Employees class and storing in Employee Groups class - array
		empGroups.employees[0] = empDetails.emp1;
		empGroups.employees[1] = empDetails.emp2;
		empGroups.employees[2] = empDetails.emp3;
		
		//Printing the first employee name and ID
		System.out.println("Employee Name: "+empGroups.employees[0]+", Employee ID: "+empGroups.empID[0]);
	
	}
}

