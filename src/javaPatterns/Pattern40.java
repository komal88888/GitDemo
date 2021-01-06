package javaPatterns;

public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; int z=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
			System.out.print(" ");	
			}
			
			for(int k=z;k>=1;k--)
			{
				System.out.print(k);
			}
			z+=2;
			System.out.println();
		}
	}

}
