import java.util.Scanner;

	public class IT24102290Lab4Q3
	{
		public static void main(String[]args)
		{
                  Scanner input = new Scanner(System.in);
                  System.out.print("Enter a number: ");

                  double no = input.nextDouble();

                  //With using ternary operator

                   String result=(no<0)?"Negative": (no>0)?"Positive": "Zero";

                   System.out.print("The number is:" +result);
                   }
        }
