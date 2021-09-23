
public class BabyMaker
	{

		public static void main(String[] args)
			{
			
				Baby firstBorn = new Baby ("Mosla", 8.0, false);
				Baby secondBorn = new Baby ("Supasadio", 7.9, false);
				Baby thirdBorn = new Baby ("Senorbobby", 7.8, false);
				
				
				System.out.println("My first baby was " + firstBorn.name);
				System.out.println("My second baby was " + secondBorn.name);
				System.out.println("My third baby was " + thirdBorn.name);
				firstBorn.play();
				System.out.println("Bobby");
			
			
			}

	
	
	
	
	}
