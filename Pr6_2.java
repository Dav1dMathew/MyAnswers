public class Pr6_2
{
	// outputs a string with n stars
	public static String stars(int n)
	{	String stars = ""; // empty String
		for (int i = 0; i < n; i++)
			stars = stars + "*";
		return stars;
	}
	
	public static void main(String[] args)
	{	
		int num = IBIO.inputInt("enter number of lines ");
		
		for (int i = 0; i < num; i++)
			IBIO.output(stars(i + 1));
		
		for (int i = num-1; i > 0; i--)
			IBIO.output(stars(i));
	}
}
