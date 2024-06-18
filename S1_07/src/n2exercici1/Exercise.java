package n2exercici1;

import java.lang.annotation.*; 

public class Exercise {
	
	@Target(ElementType.TYPE)
	@interface JsonSerializable {
		String jsonFolder() default "";
	}
	
	@JsonSerializable (jsonFolder = "c:/Users/my_user/Documents/")
	class Person {
		private String name;
		private String lastName;
		public Person(String name, String lastName) {
			this.name = name;
			this.lastName = lastName;
		}
		
		@Override
		public String toString() {
			return "Person [name=" + name + ", lastName=" + lastName + "]";
		}
	}
	
	public static void main(String[] args) {
		
	}
}
