package javaPatterns;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (char i='A';i<='E';i++)
	    {
	    	for(char j='E';j>=i;j--)
	    	{
	    		System.out.print(i);
	    	}
	    	System.out.println("");
	    }
	}

}
