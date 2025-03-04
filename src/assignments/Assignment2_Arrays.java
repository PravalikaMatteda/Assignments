package assignments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3D array for 5 Semesters,6 subjects and with their respective marks
		String [][][]subjectsWiseMarksInSemesters = 
			{
					    {
					        {"Sem1", "Mathematics I", "78"}, {"Sem1", "Physics", "85"}, {"Sem1", "Chemistry", "91"},
					        {"Sem1", "Computer Programming", "74"}, {"Sem1", "Engineering Drawing", "88"}, {"Sem1", "Basic Electrical Eng.", "79"}
					    },
					    {
					        {"Sem2", "Mathematics II", "82"}, {"Sem2", "Mechanics", "77"}, {"Sem2", "Environmental Sci.", "93"},
					        {"Sem2", "Basic Electronics", "69"}, {"Sem2", "Engineering Physics", "84"}, {"Sem2", "Engineering Graphics", "90"}
					    },
					    {
					        {"Sem3", "Data Structures", "88"}, {"Sem3", "Discrete Mathematics", "81"}, {"Sem3", "Digital Electronics", "76"},
					        {"Sem3", "Operating Systems", "92"}, {"Sem3", "Signals and Systems", "85"}, {"Sem3", "Object-Oriented Prog.", "78"}
					    },
					    {
					        {"Sem4", "Algorithms", "91"}, {"Sem4", "Computer Networks", "73"}, {"Sem4", "Database Systems", "89"},
					        {"Sem4", "Microprocessors", "80"}, {"Sem4", "Communication Eng.", "76"}, {"Sem4", "Software Engineering", "87"}
					    },
					    {
					        {"Sem5", "Probability & Stats", "86"}, {"Sem5", "Machine Learning", "88"}, {"Sem5", "Compiler Design", "84"},
					        {"Sem5", "Theory of Computation", "95"}, {"Sem5", "Embedded Systems", "73"}, {"Sem5", "Computer Graphics", "90"}
					    }
			};
		//Print Semester 3 - Subject 4 Name.
		System.out.println("The fourth subject in Semester 3 is "+subjectsWiseMarksInSemesters[2][3][1]);
		
		//Print Semester 3 - Subject 5 Name.
		System.out.println("The fifth subject in Semester 3 is "+subjectsWiseMarksInSemesters[2][4][1]);
		
		//Print Semester 5 - Subject 3 and Subject 6 marks
		System.out.println("The third and sixth subject marks in Semester 5 are "+subjectsWiseMarksInSemesters[4][2][2]+" and "+subjectsWiseMarksInSemesters[4][5][2]);
	}
		

}
