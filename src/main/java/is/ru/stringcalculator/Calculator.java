package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {
		if(text.equals(""))
			return 0;
		else if (text.contains(",")) {
			String [] numbers = text.split(",");
			int total = 0;
			for(String number : numbers) {
				total += toInt(number);
			}
			return total;
		}
		else 
			return 1;
	}

	private static int toInt(String text)
	{
		return Integer.parseInt(text);
	}

	private static String [] splitNumbers(String numbers) {
		return numbers.split(",");
	}
}