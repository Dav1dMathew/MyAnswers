public class Pr7_1
{
	
	public static void main(String[] args )
	{
		double xx = 1;
		for (int i = 0; i < 10; i++)
		{
			xx = xx * 3.732;
			int x = (int)(xx*100);
			//IBIO.output(xx);
			System.out.println( (double)x/100);
			System.out.printf( "\tprintf output: %,10.2f\n", xx);
		}
		
	}

}
