class Pattern11 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5; i++)
		{
			char ch1 = 'A';
			char ch2 = 'a';
			for(int j = 1; j<=5; j++)
			{
				if(i % 2 == 1)
				{
					System.out.print((int)ch1+ "\t");
					ch1++;
				}
				else
				{
					System.out.print((int)ch2+ "\t");
					ch2++;
				}
			}
			System.out.println();
		}
	}
}

/* 

65      66      67      68      69
97      98      99      100     101
65      66      67      68      69
97      98      99      100     101
65      66      67      68      69

*/