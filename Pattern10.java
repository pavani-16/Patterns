class Pattern10 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5; i++)
		{
			int num1 = 3; 
			int num2 = 5;
			for(int j = 1; j<=5; j++)
			{
				if(i%2==1)
					System.out.print(num1*j + "\t");
				else
					System.out.print(num2*j + "\t");
			}
			System.out.println();
		}
	}
}

/*

3       6       9       12      15
5       10      15      20      25
3       6       9       12      15
5       10      15      20      25
3       6       9       12      15

*/