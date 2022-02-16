//PROGRAM NO:10 write a java program to find the transport of a given matrix
import java.io.*;
import java.util.*;
class matrix
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total row::");		
                                   int row=sc.nextInt();
		System.out.println("Enter the total column::");
		int column=sc.nextInt();
		
		int array[][]=new int[row][column];
		System.out.print("Enter the Matrix::");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				array[i][j]=sc.nextInt();
			    System.out.println("");
			}	
		}
		System.out.println("Above matrix is before transpose:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
					System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("Above matrix is after transpose:");
		for(i=0;i<column;i++)
		{
			for(j=0;j<row;j++)
			{
					System.out.print(array[j][i]+" ");
			}
			System.out.println(" ");
		}
	}
}
		
		
		
	

		
		