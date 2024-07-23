package Pattern;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String star="*";
		
		int i,j;
		int row=6;
		for(i=0;i<row;i++)
		{
			for(j=2*(row-1);j>=0;j--)
			{
		   System.out.print("");
			}
			
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");

			}
			System.out.println();

		}

	}
	
	}
	
