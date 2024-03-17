package gittGithub.constructors;

public class MainStudent {

	public static void main(String[] args) {



		/*StudentData st = new StudentData();
	// 1) using object reference variable initialize the data

	st.sid=101;
	st.sname="vickky";
	st.sgrad='A';
	st.printStudentData();
		 */

		// 2) using method
		
	/* StudentData st = new StudentData();
	   st.setStudentData(111,"john",'Z');
	   st.printStudentData();
	   st.setStudentData(123, "cena", 'c');
	   st.printStudentData();
	   st.setStudentData(999,"wwe",'b');
	   st.printStudentData();
		*/ 

		// 3) using constructor
		
		StudentData st = new StudentData(999,"tim",'X');
		StudentData st1 = new StudentData(123, "saiprasad", 'p');
		StudentData st2 = new StudentData(111,"venky",'Z');
		st.printStudentData();
		st2.printStudentData();
		st1.printStudentData();
	
	}	
}
