package gittGithub.constructors;

public class StudentData {

	int sid;
	String sname;
	char sgrad;
	
	// below three ways we can store the data into variables
	
	void printStudentData(){
		System.out.println("sid "+"sname "+"sgard");
		System.out.println("***********************************");
		System.out.println(sid+" "+sname+" "+sgrad);
	    System.out.println("sid "+sid+" sname "+sname+" sgrad "+sgrad);
	}
	
	void setStudentData(int id, String name, char grad){
		sid = id;
		sname = name;
		sgrad = grad;
	}
	
	 StudentData(int id, String name, char grad) {
		sid = id;
		sname = name;
		sgrad = grad;
	}
}
