class Pattern13 
{
	public static void main(String[] args) 
	{
		// febonacci series pattern logic.
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i = 1; i<=3; i++)
		{
			for(int j = 1; j<=4; j++)
			{
				System.out.print(sum + "\t");
				a = b;
				b = sum;
				sum = a+b;
				
			}
			System.out.println();
		}
	}
}


/*

0  1  1  2
3  5  8  13
21 34 55 89

*/
