
public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"Java  ","Engin Demiroğ",30,"Nisan");
		Course course2 = new Course(2,"Python","Engin Demiroğ",20,"Temmuz");
		Course course3 = new Course(3,"C#    ","Engin Demiroğ",30,"Ocak");
		Course course4 = new Course(4,"Html  ","Engin Demiroğ",25,"Haziran");
		
		Course[] courses = {
				course1,
				course2,
				course3,
				course4
		};
		
		System.out.println("Course Name       Price" +"\n");
		
		for (Course course : courses) {
			System.out.println(course.name+"             " + course.unitPrice);
		}
		
		
		System.out.println("-----------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addToSystem("course1");
		courseManager.addToSystem("course2");
		courseManager.addToSystem("course3");
		courseManager.addToSystem("course4");
		System.out.println("-----------------");
		courseManager.refund("Html");
	}

}
