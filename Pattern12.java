class Pattern12 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=4; i++)
		{
			int num1 = 1;
			int num2 = 1;
			for(int j = 1; j<=4; j++)
			{
				if(i%2==1){
					System.out.print(num1 + "\t");
					num1 = num1 + 1;
				}
				else{
					System.out.print(num2 + "\t");
					num2 = num2 + num2;
				}
			}
			System.out.println();
		}
	}
}
