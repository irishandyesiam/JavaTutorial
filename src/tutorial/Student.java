package tutorial;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public boolean equals(Student other) {
		if (this.name == other.name) {
			return true;
		}
		else {
			return false;
		}
	}
}
