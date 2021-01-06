package javaPatterns;

public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* char z='A';
		for(char i='A';i<='E';i++)
		{
			for(char j='D';j>=i;j--)
			{
			System.out.print(" ");	
			}
			
			for(char k='A';k<=z;k++)
			{
				System.out.print(i);
			}
			z+=2;
			System.out.println();
		}*/
		
		
		
	int m=1, p=5,r=p-1;
	for(int i=0;i<=p;i++)
	{
		for(int j=r;j>i;j--)
		{
			System.out.print(" ");
		}
		
		for(int k=0;k<m;k++)
		{
			System.out.print((char)(i+65));
		}
		m+=2;
		System.out.println();
		
	}
	}

}
