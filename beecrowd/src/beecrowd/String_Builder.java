package beecrowd;

class model{
	String name;
	String age;
	
	void setName(String name1) {
		this.name = name1;
	}
	String getName() {
		return name;
	}
	void setAge(String age1) {
		this.age = age1;
	}
	String getAge() {
		return age;
	}
}

public class String_Builder {

	public static void main(String[] args) {
		model user = new model();
		String sql = "Insert into users (name,age)";
		user.setName("Arif Ahmed");
		user.setAge("23");
		sql += "values ('"+ user.getName();
		sql += "','" + user.getAge();
		sql += "')";
		System.out.println(sql);
		//Insted of using += we must write StringBuilder
		StringBuilder sb = new StringBuilder("Hello my name is ");
		sb.append(user.getName());
		sb.append(", I'm ");
		sb.append(user.getAge());
		sb.append(" Years old");
		System.out.println(sb.toString());
		

	}

}
