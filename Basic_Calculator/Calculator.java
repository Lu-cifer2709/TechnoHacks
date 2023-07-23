import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		double a, b;
		char choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n***************************************BASIC CALCULATOR***************************");
		System.out.println("\nWhat Do You Want To Do? \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
		do{
			System.out.print("\n\nEnter your choice : ");
			choice=sc.next().charAt(0);
			switch(choice)
			{ 
			    case '1':
				System.out.print("Enter First No. : ");
			    a=sc.nextDouble();
				System.out.print("Enter Second No. : ");
			    b=sc.nextDouble();	
			    System.out.print("Result : " + (a+b));
			    break;
			     
			     case '2':
				 System.out.print("Enter First No. : ");
			     a=sc.nextDouble();
				 System.out.print("Enter Second No. : ");
				 b=sc.nextDouble();	
				 System.out.print("Result : " + (a-b));
				 break;
				    
			     case '3':
				 System.out.print("Enter First No. : ");
			     a=sc.nextDouble();
				 System.out.print("Enter Second No. : ");
				 b=sc.nextDouble();	
				 System.out.print("Result : " + (a/b));
				 break;
				    
			     case '4':
				 System.out.print("Enter First No. : ");
			     a=sc.nextDouble();
				 System.out.print("Enter Second No. : ");
				 b=sc.nextDouble();	
				 System.out.print("Result : " + (a*b));
				 break;
				   
			     case '5':
				 System.out.println("**********************************Thanks For Using Me******************");
				 System.exit(0);
				 break;

				 default : System.out.print("Wrong Choice.....\n");
				 break;
			}
	    }
		while(choice!= 5);
        sc.close();
	}
}
