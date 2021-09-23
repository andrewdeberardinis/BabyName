
public class BabyMaker
	{

		public static void main(String[] args)
			{
			
				Baby firstBorn = new Baby ("Mosla", 8.0, false);
				Baby secondBorn = new Baby ("Supasadio", 7.9, false);
				
				System.out.println("My first baby was " + firstBorn.getName());
				System.out.println("My second baby was " + secondBorn.getName());
				firstBorn.setName("Bigvirg");
				
				System.out.println();
				firstBorn.play();

			
			
			}

	
	
	
	
	}
