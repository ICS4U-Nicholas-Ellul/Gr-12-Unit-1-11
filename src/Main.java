import java.util.*;

public class Main {
	public static void main(String[] args) {
        
		Student[] classOfStudents = new Student[2];			
		String studentsName;
		int studentGrade;
		float studentsAverage;
		boolean done = false; 
		String choice; 
		
		ArrayList<Student> classList = new ArrayList<Student>();
		
		Scanner reader = new Scanner(System.in);
		
		while(done == false){
			System.out.println("Enter students name:");
			studentsName = reader.nextLine();
			System.out.println("Enter students grade: ");
			studentGrade = reader.nextInt();
			System.out.println("Enter students average: ");
			studentsAverage = reader.nextFloat();
		
			
			Student newStudent = new Student(studentsName,studentGrade,studentsAverage);
			
			classList.add(newStudent); 
			
			System.out.println("New student: " + studentsName);
			System.out.println("Grade: " + studentGrade);
			System.out.println("Student Average " + studentsAverage);
			System.out.println("Would you like to add a new student? (y) or (n)");
			choice = reader.next();
			
			if(choice != "y" | choice != "Y"){
				done = true;
				
			}
		}
		
		for (Student element : classList) {
			System.out.println("");
			System.out.println("Student: " + element.GetName());
			System.out.println("Grade: " + element.GetGrade());
			System.out.println("Student Average " + element.GetAverage());
			System.out.println("");
		}
		
		
	}
}
