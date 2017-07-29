import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int choice;
		double num1, num2;
		
		System.out.println("*** Welcome to Calculator ***");
		
		while(true){
			
			System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
			System.out.println("Enter your choice: ");
			choice = scn.nextInt();
			
			
			switch(choice){
				case 1:
					System.out.println("Enter first number: ");
					num1 = scn.nextDouble();
					System.out.println("Enter second number: ");
					num2 = scn.nextDouble();

					System.out.println(num1+" + "+num2+" = "+Addition.add(num1, num2));
					break;
				
				case 2:
					System.out.println("Enter first number: ");
					num1 = scn.nextDouble();
					System.out.println("Enter second number: ");
					num2 = scn.nextDouble();

					System.out.println(num1+" - "+num2+" = "+Subtraction.sub(num1, num2));
					break;
					
				case 3:
					System.out.println("Enter first number: ");
					num1 = scn.nextDouble();
					System.out.println("Enter second number: ");
					num2 = scn.nextDouble();

					System.out.println(num1+" * "+num2+" = "+Multiplication.mul(num1, num2));
					break;
					
				case 4:
					System.out.println("Enter first number: ");
					num1 = scn.nextDouble();
					System.out.println("Enter second number: ");
					num2 = scn.nextDouble();

					System.out.println(num1+" / "+num2+" = "+Division.div(num1, num2));
					break;
			
				case 5:
					System.exit(0);
					break;
					
				default:
					System.out.println("Wrong choice try again!");
					break;
			}
		}
		
	}

}
