package week3.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id " + id);	
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id " + id);	
		System.out.println("Student name " + name);
	}
	
	public void getStudentInfo(String email,int phnnum) {
		System.out.println("Student email " + email);	
		System.out.println("Student Phone Number " + phnnum);
	}

	public static void main(String[] args) {
		 
		Students st= new Students();
		st.getStudentInfo(1789);
		st.getStudentInfo(1789, "Sivani");
		st.getStudentInfo("sivani@gmail.com", 14789569);

	}

}
