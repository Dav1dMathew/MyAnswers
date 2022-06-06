public class Pr6_1
{
	// outputs a string with n stars, 10 spaces in
	public static String stars(int n)
	{	String stars = "          "; // add 10 spaces prefix
		for (int i = 0; i < n; i++)
			stars = stars + "*";
		return stars;
	}
	
	public static void main(String[] args)
	{	
		int num = IBIO.inputInt("enter number of lines ");
		String aa = stars(num);
		for (int i = 0; i < num; i++)
			IBIO.output(aa);
	}
}
