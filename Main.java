package ArrayOfObjectWithPolymorphism;

public class Main {
	// this is the real use of abstract with polymorphism 
	// this method is general so we can use it by all objects which inheritance from Person class
	public static void display(Person p) {
		System.out.println("it's polymorphism by "+ p.name);
	}

	public static void main(String[] args) {
		Father f1 = new Father("saad", 70, 1000);
		Daughter d1 = new Daughter("hiba" , 35 , true);
		Wife w1 = new Wife("annam", 60 , "mahmood");
		
		f1.print(w1);
		d1.print(f1);
		
		Person [] family = new Person[3];
		family[0] =  f1;
		family[1] =  d1;
		family[2] =  w1;
		
		for (Person item : family) {
			item.info();       
		}
		Person p1 = new Father("sami", 80, 2000);  // upCasting
		System.out.println(p1.age);    
		
		display(f1);
		display(d1);
		display(w1);
		
	}

}
