//Complete
public class Patient  {
	private String name;
	private int age;
	private char gender;
	private int priority;
	
	
	
	public Patient(String name, int age, char gender, int priority) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public static String header() {
		String msg = String.format("%-20s %-3s %-1s %-1s", "Name", "Age", "Gender", "Priority");
		
		return msg;}
	public String toString() {
		String msg = String.format("%-20s %-3d %-5s %-6d", name, age, gender, priority);
		
		return msg;
	}
}
