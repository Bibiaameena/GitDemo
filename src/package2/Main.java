package package2;

import com.fasterxml.jackson.databind.ObjectMapper;

class Person{
	private String name;
	private int age;
	
	//Generate getters and setters
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
	
}

public class Main {
	public static void main(String[] args) throws Exception {
		
//		//Deserialization
//		String jsonString = "{\"name\":\"Jenny\",\"age:20\"}";
//		ObjectMapper objectMapper = new ObjectMapper();
//		Person person = objectMapper.readValue(jsonString, Person.class);
//		
//		//print name
//		System.out.println(person.getName());
//		
//		//print age
//		System.out.println(person.getAge());
		
		//Serialization
		Person person1 = new Person();
		person1.setName("Raha");
		person1.setAge(21);
		ObjectMapper objectMapper1 = new ObjectMapper();
		String jsonString1 = objectMapper1.writeValueAsString(person1);
		System.out.println(jsonString1);
	}
}
