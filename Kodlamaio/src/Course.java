
public class Course {
	
	public Course() {
		System.out.println("Courses listed");
	}

	public Course(int id,String name,String instructor,int unitPrice,String detail) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	String instructor;
	int unitPrice;
	String detail;
	
}
