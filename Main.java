//"Create a class ""Parent"" with a method that prints ""This is parent class"" and
//its subclass with another method that prints ""This is child class"". Now, 
//create an object for each of the class and call
// - method of parent class by object of parent class
// - method of child class by object of child class
// - method of parent class by object of child class"


package Basics;

//parent class
class Parent{
	void parentmethod() {
		System.out.println("This is the parent class");
	}
}
//child class
class Child extends Parent{
	void childMethod() {
		System.out.println("This is the child class");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parobj = new Parent();// create obj of parent class
		parobj.parentmethod();
		
		Child childobj = new Child();// create obj of child class
		childobj.childMethod();
		
		childobj.parentmethod();

	}

}
