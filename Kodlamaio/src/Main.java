
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1,"Enes","12345","asdasd@gmail.com");
		
		User student = new User(2,"Student","6789","bnmbnm@gmail.com");
		
		User instructor = new User(3,"Instructor","1234","engindemirog@gmail.com");
		
		User[] users = {user1,student,instructor};
		
		for (User user : users) {
			System.out.println(user.getUserName());
		}
		
		System.out.println("--------------------");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.add(student);
		userManager.add(instructor);
		
		System.out.println("--------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.lessonHour(3);
		instructorManager.workingDay(2);
		
		System.out.println("--------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.numOfHomewok(2);
		studentManager.examGrade(90);
		studentManager.examGrade(60);
		
	}

}
