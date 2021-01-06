package javaPatterns;

public class Pattern41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 char z='A';
		for(char i='A';i<='E';i++)
		{
			for(char j='D';j>=i;j--)
			{
			System.out.print(" ");	
			}
			
			for(char k='A';k<=z;k++)
			{
				System.out.print(k);
			}
			z+=2;
			System.out.println();
		}*/
		
		int n=5,p=n-1,z=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=p;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<z;k++)
			{
				System.out.print((char)(k+65));
			}
			z+=2;
			System.out.println();
		}
	}

}
