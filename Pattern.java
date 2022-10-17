/*
 
 ****
 ****
 ****
 ****
 
 */
public class Pattern {

	public static void main(String args[])
	{
		int i,k;
		
		for(i=1;i<=4;i++)
		{
			for(k=1;k<=4;k++)
			{   
				if(i==1 || k==1 || k==4 || i==4)
				{
					System.out.print("$ ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
			
		}
	}
}
