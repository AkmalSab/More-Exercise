package Output;

import Input.weight;
import Process.calculate;
import java.util.Scanner;

public class result {
	
	static weight w = new weight();
	static double weightInput;
	static Scanner s = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.println("Enter your weight in Kilogram: ");
		weightInput = s.nextDouble();
		w.setWeight(weightInput);
		calculate c = new calculate(w.getWeight());
		System.out.println("Your weight in Earth planet is: " + weightInput + " Kg");
		System.out.println("Your weight in Mars planet is: " + c.result() + " Kg");
	}
}
