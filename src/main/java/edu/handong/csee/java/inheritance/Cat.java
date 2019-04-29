package edu.handong.csee.java.inheritance;

public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        Animal myAnimal = myCat;
        myAnimal.testInstanceMethod();	// maybe print cat
        myAnimal = myDog;
        myAnimal.testInstanceMethod();	// maybe print dog
    }
}
