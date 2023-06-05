//Create a class called Product with the following attributes and methods:
//
//Attributes:
//name (String)
//price (double)
//quantity (int)
//totalSold (static int)
//Methods:
//void sell(int quantity): This method should decrease the quantity of the product by the given quantity and update the totalSold static variable accordingly.
//static int getTotalSold(): This method should return the total quantity of products sold so far.
//In the Main class, test the Product class by doing the following:
//Create multiple instances of Product and set their name, price, and quantity.
//Call the sell() method for some of the product instances to simulate selling them.
//Print the total quantity of products sold using the getTotalSold() method.
package first_java;

 class product
	{
		String name;
		double price;
		int quantity;
		static int totalSold;
		
		public product(String name,double price,int quantity)
		{
			this.name=name;
			this.price=price;
			this.quantity=quantity;
		}
	
		void sell(int quantity)
		{
			if(quantity<=this.quantity)
			{
				this.quantity = this.quantity - quantity;
				totalSold = quantity + totalSold;
			}
			else
			{
				System.out.println("Product is not available for sell !!");
			}
		}
		
		public static int  getTotalSold()
		{
			return totalSold;
		}

	}
public class static_product {
		public static void main(String[] args) {
			product obj1= new product("book",100.00,10);
			product obj2= new product("pen",5.00,100);
			product obj3= new product("bag",500.00,50);
			
			obj1.sell(50);
			obj2.sell(100);
			obj3.sell(30);
			
			 System.out.println("Total quantity of products sold: " + product.getTotalSold());

		}

	}
