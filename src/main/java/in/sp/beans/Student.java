package in.sp.beans;

public class Student {
	private int rollNo;
	private String Name;
	private float Marks;
	
	
	
	public int getRollNo()
	{
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getMarks() {
		return Marks;
	}
	public void setMarks(float marks) {
		Marks = marks;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void display() {
		
		
		System.err.println(rollNo);
		System.out.println(Marks);
		System.out.println(Name);
	}
}
