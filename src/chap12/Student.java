package chap12;

public class Student {

	/* fields */
	private int studentID;
	private String studentName;
	private int score;
	
	/* constructors */
	Student() {}

	Student(int studentID, String studentName, int score) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.score = score;
	}
	
	
	/* methods */
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return studentID + " : " + studentName + "( " + score + " )";
	}
	
	
}
