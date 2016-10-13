package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {
		if(text.equals(""))
			return 0;
		else if (text.contains(",")) {
			return sum(splitNumbers(text));
		}
		else 
			return 1;
	}

	private static int toInt(String text)
	{
		return Integer.parseInt(text);
	}

	private static String [] splitNumbers(String numbers) {
		if (numbers.contains("\n")) {
			numbers = numbers.replace("\n", ",");
		}
		return numbers.split(",");
	}

	private static int sum (String [] numbers) {
			int total = 0;
			for(String number : numbers) {
				total += toInt(number);
			}
			return total;
	}
}