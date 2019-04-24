package buoi5;

public class main {
public static void main (String[]agrs) {
		animal animal = new animal("meo",3);
		System.out.println("Name: " + animal.getName());
		System.out.println("Age: "+ animal.getAge());
		
		dog dog = new dog("heo", 5, "dog");
		System.out.println("Name of "+ dog.getTypeAnimal()+ " :" + dog.getName());
		System.out.println("Age: "+dog.getAge());
		
		Tiger tiger = new Tiger("Bo", 7, "tiger sliver");
		System.out.println("Name of " + tiger.getTypeAnimal() + " :" + tiger.getName());
		System.out.println("Age: " + tiger.getAge());
	}

}

