public class Pr6_3
{
	// returns a String made of n spaces
	public static String spaces(int n)
	{	String spaces = "";
		for (int i = 0; i < n; i++)
			spaces = spaces + " ";
		return spaces;
	}
	
	// returns a String made of n stars, with a space in between
	public static String stars(int n)
	{	String stars = "";
		for (int i = 0; i < n; i++)
			stars = stars + "* ";
		return stars.trim(); // remove trailing space with trim
	}
	public static void main (String[] args)
	{
		int num = IBIO.inputInt("enter number of lines ");
		String lineOfStars = stars(num);
		// comment and uncomment loops to see how they work
		// top part of the arrow head
		for(int i = num-1; i > 0; i--)
		{	IBIO.output(spaces(i) + lineOfStars);
		}	
		// bottom part
		for(int i = 0; i < num; i++)
		{	IBIO.output(spaces(i) + lineOfStars);
		}
		// why do we use lineOfStars instead of stars(num) inside the loops? think about two reasons
		
	}
}
