class Pattern9 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=5; i++)
		{
			char cap = 'A';
			char smal = 'a';
			for(int j = 1; j<=5; j++)
			{
				if(i % 2 == 1){
				System.out.print(cap+ "\t");
				cap++;
				}
				else{
					System.out.print(smal+"\t");
					smal++;
				}
				
			}
			System.out.println();
		}
	}
}
 

/*

A       B       C       D       E
a       b       c       d       e
A       B       C       D       E
a       b       c       d       e
A       B       C       D       E

*/