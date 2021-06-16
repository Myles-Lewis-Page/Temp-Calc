import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		
		int Temp;
		Scanner imput = new Scanner(System.in);
		
		//Starting 
		System.out.println("Hello Welcome to my Temp calculater!");
		System.out.println("");
		
		//This part is Fahrenheit to Celsius
		System.out.println("Starting at Fahrenheit to Celsius");
		System.out.println("The Fehrenheit Temp is");
		Temp = imput.nextInt();
		System.out.println("Fehrenheit = " + Temp + " Degrees");
		System.out.println("That is " + (Temp - 32)/1.8 + " in Celsius");
		System.out.println("");
		
		//This part is Celsius to Kelvin
		System.out.println("Next is Celsius to Kelvin");
		System.out.println("The Celsius Temp is");
		Temp = imput.nextInt();
		System.out.println("Celsius = " + Temp + " Degrees");
		System.out.println("That is " + (Temp+273.15)  + " in Kelvin");
		System.out.println("");
		
		//This part is Kelvin to Fahrenheit
		System.out.println("Next is Kelvin to Fahrenheit");
		System.out.println("The Kelvin Temp is");
		Temp = imput.nextInt();
		System.out.println("Kelvin = " + Temp + " Degrees");
		System.out.println("That is " + ((Temp+459.67)*5/9)  + " in Fahrenheit");
		System.out.println("");
	}

}
