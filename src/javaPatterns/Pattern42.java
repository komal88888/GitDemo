package javaPatterns;

public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	 char z='A';
		for(char i='A';i<='E';i++)
		{
			for(char j='D';j>=i;j--)
			{
			System.out.print(" ");	
			}
			
			for(char k=z;k>='A';k--)
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
			for(int k=z;k>=1;k--)
			{
				System.out.print((char)(k+64));
			}
			z+=2;
			System.out.println();
		}
	}

}
