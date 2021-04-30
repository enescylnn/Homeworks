
public class CourseManager {
	String reason;
	
	public void addToSystem(String name){
		System.out.println(name + " course added the system.");
	}
	
	public void refund(String courseName) {
		
		if (reason == null) {
			System.out.println(courseName + " refund has been made");
		}
		
	}

}
