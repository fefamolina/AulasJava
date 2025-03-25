package ConversaoTemperatura;

public class conversaoTemperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fahrenheit;
		double celsius;
		for (fahrenheit = 100; fahrenheit <= 150; fahrenheit++) {
			celsius = (double) 5 / 9 * (fahrenheit - 32);
			//System.out.println("fahrenheit: " + fahrenheit+ "\t celsius: "+ celsius);
			System.out.printf("%s%d%s%.1f\n", "fahrenheit: ", fahrenheit, "\t celsius: ", celsius);
		}
	}

}
