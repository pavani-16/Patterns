class Pattern22 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5; i++)
		{
			int num1 = 2;
			int num2 = 1;
			for(int j = 1; j<=5; j++)
			{
				if(i<=j)
				{
					if(i%2==1)
					{
						System.out.print(num1+" ");
						num1 = num1 + 2;
					}
					else
					{
						System.out.print(num2 +" ");
						num2 = num2 + 2;
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

/*

2 4 6 8 10
  1 3 5 7
    2 4 6
      1 3
        2

*/