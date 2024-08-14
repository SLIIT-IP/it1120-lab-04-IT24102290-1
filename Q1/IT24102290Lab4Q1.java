import java.util.Scanner;

	public class IT24102290Lab4Q1
	{
		public static void main(String[]args)
		{

                 Scanner input = new Scanner(System.in);
                 System.out.print("Enter the number= ");
                 double no = input.nextDouble();

                 if(no>0)
                 {System.out.print("The number is: Positive");}
                 else if(no<0)
                 {System.out.print("The number is: Negative");}
                 else
                 {System.out.print("The number is zero");}
              }
}
