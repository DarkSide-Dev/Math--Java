import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double x;
		double y;
		double z;
		
		System.out.println("Enter side x of the triangle: ");
		x = scanner.nextDouble();
		
		System.out.println("Enter side y of the triangle: ");
		y = scanner.nextDouble();
		
		//z = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		z = Math.hypot(x, y);
		
		System.out.println("The hypotenuse is: "+z);
		
		scanner.close();

	}

}
