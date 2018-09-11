import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class CalculateCirclePerimeterExample {
	public  boolean IsPrime(int N){
	        boolean a=true;
	        for(int i=2;i<N;i++){
	           if(N%i==0){
	               a=false;
	               break;
	           } 
	        }
	        return a;
	    }  
	public static void main(String[] args) {
		
		int radius = 0;
		int N=53;
		System.out.println("Please enter radius of a circle");
		
		try
		{
			//get the radius from console
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			radius = Integer.parseInt(br.readLine());
		}
		//if invalid value was entered
		catch(NumberFormatException ne)
		{
			System.out.println("Invalid radius value" + ne);
			System.exit(0);
		}
		catch(IOException ioe)
		{
			System.out.println("IO Error :" + ioe);
			System.exit(0);
		}
		
		/*
		 * Perimeter of a circle is
		 * 2 * pi * r
		 * where r is a radius of a circle.
		 */
		
		//NOTE : use Math.PI constant to get value of pi
		double perimeter = 2 * Math.PI * radius;
		
		System.out.println("Perimeter of a circle is " + perimeter);
		CalculateCirclePerimeterExample IIsPrime = new CalculateCirclePerimeterExample();
		boolean a= IIsPrime.IsPrime(N);
		System.out.println(a);
	}
}
 
/*
Output of Calculate Circle Perimeter using Java Example would be
Please enter radius of a circle
19
Perimeter of a circle is 119.38052083641213
*/