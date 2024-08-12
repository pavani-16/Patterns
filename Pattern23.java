class Pattern23 
{
	public static void main(String[] args) 
	{
		char alph = 'A';
		int a = 0;
		int b = 1;
		int sum = 0;
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print(alph+"\t");
					alph++;
				}
				else
				{
					System.out.print(sum+"\t");
					a = b;
					b= sum;
					sum = a+b;
				}
			}
			System.out.println();
		}
	}
}

/*

A       0       1       1       2
B       C       3       5       8
D       E       F       13      21
G       H       I       J       34
K       L       M       N       O

*/