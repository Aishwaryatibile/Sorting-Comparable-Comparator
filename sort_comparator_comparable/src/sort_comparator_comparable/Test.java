package sort_comparator_comparable;


class Human {

}

class Doctor extends Human {

}

class Animal {

}

class Dog extends Animal {

}

class Bird {

}


public class Test {
	
	//To restrict the access of this method for Human type only 
	//public static <T> void  printInfo(T anyObj) --for any object type
	public static <T extends Human> void  printInfo(T onlyHuman) {
		//System.out.println("You are a Human/Animal/Bird");
		System.out.println("You are a Human..");
	}
	
	public static void main(String[] args) {
		printInfo(new Human());
		printInfo(new Doctor());
		//printInfo(new Dog());
		
	}

}
