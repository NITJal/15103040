package assignments;

abstract class shape{
	
	abstract void numberofsides();
	
}

 class Trapezoid extends shape{

	@Override
	void numberofsides() {
		System.out.println("Number of sides are : 4");
		
	}
	
	class Hexagon extends shape{

		@Override
		void  numberofsides() {
			System.out.println("Number of sides are : 6");
			
		}
		
		class Triangle extends shape{

			@Override
			void numberofsides() {
				System.out.println("Number of sides are : 6");
				
			}
			
			
			
		}

	
		
		
	}
	
	
	
}

public class numbersides {

	public static void main(String[] args) {
		
Trapezoid obj = new Trapezoid();
obj.numberofsides();



}
	}
