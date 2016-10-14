package is.ru.stringcalculator;
import java.util.*;
import java.io.*;
public class Calculator {

	public static int add(String text) {
		String delim = ",";
		if(text.contains("//"))
		{
			delim = text.substring(2,3);
			text = text.replaceAll(delim, ",");
			text = text.substring(4);
		}

		if(text.equals(""))
			return 0;
		if (text.contains(",")) {
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
		List negNum = new ArrayList();
		int total = 0;
			for(String number : numbers) {
				int i = toInt(number);
				if(i < 0)
				{
					negNum.add(i);
				}
				if(i <= 1000)
				{
					total += i;
				}
				
			}
			if (negNum.size() > 0)
			{
				throwNegativeNumberException(negNum);
			}
			
			return total;
	}

	public static void throwNegativeNumberException(List numbers) {
		throw new RuntimeException("Negatives not allowed: " + numbers.toString());
	}
}