class Pattern20 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5; i++)
		{
			char alph = 'A';
			int num = 1;
			for(int j = 1; j<=5; j++)
			{
				if(i<=j)
				{
					if(i%2==1)
					{
						System.out.print(alph+"\t");
						alph++;
					}
					else {
						System.out.print(num+"\t");
						num++;
					}
				}
				else
					System.out.print(" "+"\t");
			}
			System.out.println();
		}
	}
}

/*

A       B       C       D       E
        1       2       3       4
                A       B       C
                        1       2
                                A

*/