package Java_Assignment_44;
/*
 * This class will help to master the concepts of Looping concepts and logic building
 */
import java.util.*;

public class Java_Assignment4_4 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Perfect ob=new Perfect(); // creating the instance of perfect class
		ob.checkPerfect(); //Checking the number is perfect number or not
		System.out.println("\nDisplay perfect number between 1-100\n");
		ob.printPerfect(); //Printing the perfect numbers between  1 and 100

	}

}

//Base class
class AliquotSum 
{
	public int n,sum,i;
	Scanner sc;
	public AliquotSum()
	{
		sum=0;
		sc=new Scanner(System.in);
	}
	public void getNumber()
	{
		System.out.println("Enter any number");
		n=sc.nextInt();	
	}
	public void dispSum()
	{
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
		System.out.println("the sum of aliquot number : "+sum);
	}
}

//Derived class of AliquotSum class
 class Perfect extends AliquotSum
 {
	 public int i,s=0,j;
	 
	 //Checking the number is perfect or not
	 public void checkPerfect()
	 {
		 getNumber(); // Accepting the number from user input
		 dispSum(); // Displaying the sum of the numbers
		 if(sum==n)
		 {
			System.out.println(n+" is perfect number");
		 }
		 else
		 {
			 System.out.println(n+" is not perfect number"); 
		 }
			 
	 }
	 public void printPerfect() // Method to evaluate and print  the perfect numbers between 1 and 100
	 {
		 for(i=1;i<=100;i++)
		 {
			 s=0;
			 for(j=1;j<i;j++)
			 {
				 
				 if(i%j==0)
				 {
					s=s+j; //Adding the sum of the divisors
				 }
			 }
			 if(s==i)
			 {
				 System.out.println(i+" is perfect number");
			 }
		 }
	 }
 }
