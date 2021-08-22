package assignmentweek3.day1;

public class StudentInfo {
	public void getStudentInfo(int id) {
		System.out.println("Student id : "+id);	
		}
		public void getStudentInfo(int id,String name) {
			System.out.println("Student id : "+id);
			System.out.println("Student name : "+name);
			
		}
		public void getStudentInfo(String email,long phoneNumber) {
			System.out.println("Studen Email : "+email);
			System.out.println("Student phone number : "+phoneNumber);
		}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			StudentInfo obj=new StudentInfo();
			obj.getStudentInfo(1);
			obj.getStudentInfo(2, "puji");
			obj.getStudentInfo("java@method.overload", 1234567890);
		}

}
