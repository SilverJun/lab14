package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {		// hiding
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {			// overriding
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Animal myAnimal = myCat;		// polymorphism
        Animal.testClassMethod();	// maybe print class method Animal
        myAnimal.testInstanceMethod();	// maybe print instance method catance method cat
        Cat.testClassMethod();	// maybe print class method cat
        myAnimal = myDog;				// polymorphism
        myAnimal.testInstanceMethod();	// maybe print instance method dog
        Dog.testClassMethod();	// maybe print class method dog
    }
}

