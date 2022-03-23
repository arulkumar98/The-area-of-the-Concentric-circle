import java.util.Scanner;
// I am only import Scanner for better performance.

class GFG
{
	
// Function to find area between the
// two given concentric circles
static double calculateArea(int x, int y)
{
	// Declare value of pi
	double pi = 22/7;

	// Calculate area of outer circle
	double arx = pi * x * x;

	// Calculate area of inner circle
	double ary = pi * y * y;

	// Difference in areas
	return arx - ary;
}

// Driver code
public static void main (String[] args)
{
    Scanner scan  = new Scanner(System.in);
    System.out.println("Enter the value for the x"); // will be the outer circle value
    int x = scan.nextInt();

    System.out.println("Enter the value for the y"); // will be the inner circle value
	int y = scan.nextInt();
	System.out.println ("the area of concentric circle"+ " :"+calculateArea(x, y));
}
}
