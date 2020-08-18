import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter distance(m) to target:\n");
            double d = reader.nextDouble();
    
            System.out.println("Enter height(m) relative to water line: "); 
            double h = reader.nextDouble();  
            
            System.out.println("Enter initial velocity(m/s): "); 
            double v = reader.nextDouble();
            
            double a = -4.9*(d/v)*(d/v);
            double b = d;
            double c = a + h;
            
            double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            double angle = Math.atan(tanTheta)* 180/Math.PI;
            
            System.out.println("The angle is " + angle);
	}
}
