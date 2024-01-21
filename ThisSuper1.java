
class Animal {
	protected String name;
	// Constructor
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal {
	String breed;
	public Dog(String name, String breed) {
		super(name); // call to parent's constructor
		this.breed = breed;
	}

	public void bark() {
		System.out.println(name + " is barking");
	}
}

public class ThisSuper1 {
	public static void main(String[] args) {
		Dog dog = new Dog("Jackie","Golden Retriever");
		System.out.println(dog.name);
		System.out.println(dog.breed);
	}
}


