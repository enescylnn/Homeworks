
public class Student extends User {
	
	private String course;
	private String membershipDuration;
	
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getMembershipDuration() {
		return membershipDuration;
	}
	public void setMembershipDuration(String membershipDuration) {
		this.membershipDuration = membershipDuration;
	}
}
