package Output;

import Input.weight;
import Process.calculate;
import Storage.store;
import java.util.*;

public class result {
	
	static weight w = new weight();
	static double weightInput;
	static int choice;
	static Scanner s = new Scanner(System.in);
	static List<store> list = new ArrayList<store>();
	static calculate c;
	
	public static void main(String[] args) {
		
		intro();
		choice = s.nextInt();
		
		if(choice == 1) {
			calculateWeight();
			main(args);
		}
		else if(choice == 2) {
			showWeight();
			main(args);
		}
		else if(choice == 3) {
			System.exit(0);
		}
		else {
			System.out.println("\n You have enter wrong option");
			main(args);
		}
	}
	
	public static void intro() {
		System.out.println("Enter your option: \n" +
				"1. Enter weight in (kg) \n" +
				"2. Show Stored Weight \n" +
				"3. Exit system");
	}
	
	public static void storeWeight(double a, double b) {
		list.add(new store(a, b));
	}
	
	public static void showWeight() {
		System.out.println("\n");
		int i = 0;
		System.out.println("---------------Stored Weight Information---------------");
		for(store weight:list) {
			i++;
			System.out.println(i + ". Earth: " + weight.getEarth());
			System.out.println(" Mars: " + weight.getMars());
			System.out.println("\n");
		}
	}
	
	public static void calculateWeight() {
		System.out.println("\n Enter your weight in Kilogram: ");
		weightInput = s.nextDouble();
		w.setWeight(weightInput);
		c = new calculate(w.getWeight());
		System.out.println("Your weight in Earth planet is: " + weightInput + " Kg");
		System.out.println("Your weight in Mars planet is: " + c.result() + " Kg");
		storeWeight(weightInput, c.result());
		System.out.println("\n");
	}
}
