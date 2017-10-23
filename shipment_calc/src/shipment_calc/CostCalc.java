package shipment_calc;
import java.util.Scanner;

public class CostCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter the weight of item in kilogrms: ");
		double weight = input.nextDouble();
		double costperkg=0;
		if (weight <= 5)
		{
			
			costperkg=0.75;
			
		}
		else if(weight > 5)
		{
			costperkg=0.05;
		}
		System.out.println("Shipping cost of items in kg" +
				costperkg * weight);
	}

}
