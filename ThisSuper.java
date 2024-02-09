
class Animal {
	protected String name;
	public void eat() {
		System.out.println(name + " is eating.");
	}
}

class Dog extends Animal {
	String breed;
	public void bark() {
		System.out.println(name + " is barking.");
	}
}

public class ThisSuper {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.name = "JOE JOE";
		animal.eat();


		Dog dog = new Dog();
		dog.name = "Bobby";
		dog.breed = "Samoyed";
		System.out.println(dog.name);
		System.out.println(dog.breed);
		dog.eat();
		dog.bark();
	}
}


