//Create an abstract class called Animal with the following properties and methods:
//Properties:
//name (String)
//age (int)
//Methods:
//abstract void makeSound(): This method should be implemented by each subclass of Animal and should print the sound made by the specific animal.
//Create two subclasses of Animal called Dog and Cat. Implement the makeSound() method in each subclass to print the sound made by a dog and a cat, respectively.
//
//In the Main class, create instances of Dog and Cat,
//set their name and age properties, and call the makeSound() method for each instance.
package first_java;

	abstract class animal
	{
			String name;
			int age;
			 
			public animal(String n,int a)
			{
				this.name=n;
				this.age=a;
			}
			
			abstract void makesound();
	}

			class dog extends animal
			{
				public dog(String n,int a)
				{
					super(n,a);
				}
				void makesound()
				{
					System.out.println(name+" is "+age+" years old and bark");
				}
			}
			class cat extends animal
			{
				public cat(String n,int a)
				{
					super(n,a);
				}
				void makesound()
				{
					System.out.println(name+" is "+age+" years old and sounds Meoowww");
				}
			}
			
public class abstract_animal {
	public static void main(String[] args) {
					
		dog obj1=new dog("Husky",4);
		obj1.makesound();
		
		cat obj2=new cat("Havana",3);
		obj2.makesound();
		}
}
