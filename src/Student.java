public class Student{
	
	private String name;
	private GRADE gradeLevel;
	private float average;

	public enum GRADE{
		Grade7 (7),
		Grade8 (8),
		Grade9 (9),
		Grade10 (10),
		Grade11 (11),
		Grade12 (12)
		;


		private final int gradeNumber; 
		 public void refInt(int gradeNum){

		 }
		 
		public int Value(){
			return this.gradeNumber;
		}
	
		private GRADE(int gradeNumber){
			this.gradeNumber = gradeNumber;
		}

	}

	public String GetName(){
		return this.name;
	}
	
	public int GetGrade(){
		return this.gradeLevel.Value();
	}
	
	public float GetAverage(){
		return this.average;
	}
	
	Student(String nameConst, int gradeConst, float averageConst){
		
		this.name = nameConst;
		this.average = averageConst;
		
		GRADE myGrade = GRADE.values()[gradeConst - 7];
		this.gradeLevel = myGrade;

	}

}