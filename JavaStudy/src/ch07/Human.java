package ch07;
public class Human {
 char type;
 String name;
 int age;
 
 /* setter, getter 메소드 작성 */
 	public void setType(char t) {
 		type = t; 
 		
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

	public char getType() {
		return type;
	}
}