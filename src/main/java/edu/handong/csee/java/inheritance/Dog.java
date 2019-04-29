package edu.handong.csee.java.inheritance;

public class Dog extends Animal{
	public static void testClassMethod() {		// hiding
        System.out.println("The static method in Dog");
    }
    public void testInstanceMethod() {			// overriding
        System.out.println("The instance method in Dog");
    }
}
