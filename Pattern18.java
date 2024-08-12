class Pattern18 
{
	public static void main(String[] args) 
	{
		int num = 1;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 5; j>=1; j--)
			{
				if(i>=j)
				{
					System.out.print(num+ "\t");
					num++;
				}
				else
					System.out.print("  "+"\t");
			}
			System.out.println();
		}
	}
}

/*

                                1
                        2       3
                4       5       6
        7       8       9       10
11      12      13      14      15

*/