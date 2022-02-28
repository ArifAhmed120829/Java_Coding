package beecrowd;
class Daffodil{
	private String teacher;
	private String student;
	private int age1;
	private int age2;
	
	public String getTeacher() {
		return teacher;
	}
	public String getStudent() {
		return student;
	}
	public int getAge1() {
		return age1;
	}
	public int getAge2() {
		return age2;
	}
	public void setTeacher(String TeacherName) {
		this.teacher = TeacherName;
	}
	public void setStudent(String StudentName) {
		this.student = StudentName;
	}
	public void setAge1(int TeacherAge) {
		this.age1 = TeacherAge;
	}
	public void setAge2(int StudentAge) {
		this.age2 = StudentAge;
	}
	
}
class Person{
private String name;
	
	public String getFirst() {
		return name;//The get method returns the variable value,The get method returns the value of the variable name.
	}
	public void setirst(String newName) {//The set method takes a parameter (newName) & assigns it to the name variable.
		this.name = newName;//the set method sets the value.The this keyword is used to refer to the current object.
		//However, as the name variable is declared as private, we cannot access it from outside this class:
	}

}

public class Encapsulation {
	
	public static void main(String[] args) {
		/*
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable

		 */
		Person myobj = new Person();
		myobj.setirst("Arif");
		System.out.println("This "+myobj.getFirst()+" Person Created this Encapsulation Code");
		Daffodil myobj2 = new Daffodil();
		myobj2.setTeacher("Fabliha");
		myobj2.setAge1(25);
		myobj2.setStudent("Shemanto");
		myobj2.setAge2(24);
		System.out.println("My Teacher name is: "+myobj2.getTeacher()+" & Her age is approximately: "+myobj2.getAge1());
		System.out.println("Her Student name is: "+myobj2.getStudent()+" & His age is approximately: "+myobj2.getAge2());

	}

}
