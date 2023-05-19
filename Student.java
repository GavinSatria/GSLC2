package GSLC2;

public abstract class Student {
	private String name;
	private String id;
	private String department;
	
	public Student(String name, String id, String department)
	{
		setName(name);
		setId(id);
		setDepartment(department);
	}
	
	public abstract int averageScore();
	
	public String toString()
	{
		return "Name: " + name + ", ID: " + id + ", Department: " + department;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
