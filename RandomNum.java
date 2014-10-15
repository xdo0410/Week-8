public class RandomNum 
{
	private int GenerateRandomNumber;

	public RandomNum (int RandomNumber)
	{
		  GenerateRandomNumber = RandomNumber;
		  RandomNumber = 0 + (int) ( Math.random() * 3 );
	}
	

	public void setRandomNumber (int RandomNumber)
	{
		GenerateRandomNumber = RandomNumber;
		
	}

	public int getRandomNumber ()
	{
		return GenerateRandomNumber;
	}
	
}
