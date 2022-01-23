package week1.day1;

public class Student {
	
	String name = "Priya";
	int rollNo = 52748;
	
	public static void main(String[] args) {
		Student data = new Student();
		data.College();
		System.out.println(data.name);
		System.out.println(data.rollNo);	
	}
	
	public void College() {
			System.out.println("Anna University");
		}
		
	

}
