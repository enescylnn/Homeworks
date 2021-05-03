
public class StudentManager extends UserManager {
	
	public void numOfHomewok(int homework) {
		System.out.println("Student's number of homework : "+ homework);
	}
	
	public void examGrade(int grade) {
		if (grade>70) {
			System.out.println("Student passed the exam. Grade : " + grade);
		}else {
			System.out.println("Student failed the exam. Grade : " + grade);
		}
	}

}
