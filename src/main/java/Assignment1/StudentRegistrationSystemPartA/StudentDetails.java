package Assignment1.StudentRegistrationSystemPartA;

public class StudentDetails {

    //initalize student variables
    private String name;         
    private int age;
    private String DOB;
    private int ID;
    private String username;
    private String courseCode;
    
    
    public StudentDetails(String studentName, int studentAge, String studentDOB)
    {                         
        this.name = studentName;           
        this.age = studentAge;
        this.DOB = studentDOB;
        setUsername(studentName, studentAge);
    }
    
	public String getName() {
		return name;
	}
	
	public void setName(String studentName) {
		this.name = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int studentAge) {
		this.age = studentAge;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String studentDOB) {
		this.DOB = studentDOB;
	}
	
	public int getId() {
		return ID;
	}

	public void setId(int studentID) {
		this.ID = studentID;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String studentCourseCode) {
		this.courseCode = studentCourseCode;
	}
    
	public String getUsername() {
	        return username;
	}
	
	public void setUsername(String name, int age) {
        this.username = name + age;
    }
    
    public String toString() {
        return "Student Name: " + getName() + " | Student ID: " + getId();
    }
}
