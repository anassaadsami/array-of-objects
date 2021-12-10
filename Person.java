package ArrayOfObjectWithPolymorphism;

public abstract class Person {   // we don't need to make object from this class and that's why its abstranct
	String name ;
	int age ;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	} 
	public abstract void info() ;
	public abstract void print(Person p) ;  // here we can not change the type of parameter and that's why it's
	// not wroth to code this and it's better to code it in main class and when we invoke it in main method 
	// we can pass any object which inherit from super class 
		
	

}
class Father extends Person{
	int salary ;

	public Father(String name, int age, int salary) {
		super(name, age);
		this.salary = salary;	
	}
	@Override
	public void info() {
		System.out.println("hi from "+this.name);
	}
	@Override
	public void print(Person p) {   // we can not put (Father f ) as a parameter
		System.out.println("my name is "+ p.name);
	}
	
}
class Daughter extends Person{
	boolean married ;
	
	public Daughter(String name, int age, boolean married) {
		super(name, age);
		this.married = married;	
	}
	@Override
	public void info() {
		System.out.println("hi from "+this.name);
	}
	@Override
	public void print(Person p) {
		System.out.println("my name is "+ p.name);
	}
	
}
class Wife extends Person{
	String lastName;
	
	public Wife(String name, int age, String lastName) {
		super(name, age);
		this.lastName = lastName;	
	}
	@Override
	public void info() {
		System.out.println("hi from "+this.name);
	}
	@Override
	public void print(Person p) {
		System.out.println("my name is "+ p.name);
	}
	
}
