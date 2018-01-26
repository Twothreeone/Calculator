package calculator.model;

import java.util.List;
import java.util.ArrayList;

public class Calculator
{
	String answer;

	/**
	 * Constructor for the Calculator, sets the first answer to 0.
	 */
	public Calculator()
	{
		answer = "0";
	}

	/**
	 * Calls the other methods sequentially to find the answer.
	 * 
	 * @param equation
	 *            The equation from the displayPanel.
	 * @return The answer to the equation.
	 */
	public String calculate(String equation)
	{
		List<String> terms = createList(equation);
		if (!checkList(terms))
		{
			return "Syntax Error";
		}
		return doMath(terms);
	}

	/**
	 * Creates the list by splitting the equation into terms.
	 * 
	 * @param equation
	 *            The equation from the displayPanel.
	 * @return The list of terms.
	 */
	private List<String> createList(String equation)
	{
		List<String> terms = new ArrayList<String>();
		int nextSpace;
		for (int i = 0; i < equation.length(); i++)
		{
			nextSpace = equation.indexOf(' ', i);
			if (nextSpace >= 0)
			{
				terms.add(equation.substring(i, nextSpace));
				i = nextSpace;
			}
			else
			{
				terms.add(equation.substring(i));
				i = equation.length();
			}
		}
		return terms;
	}

	/**
	 * Makes sure the given list is valid.
	 * 
	 * @param terms
	 *            The list of terms made by the createList method.
	 * @return Whether or not the given list is valid.
	 */
	private boolean checkList(List<String> terms)
	{
		if (terms.size() % 2 == 0)
		{
			return false;
		}
		for (int i = 0; i < terms.size(); i += 2)
		{
			if (!isDouble(terms.get(i)) && !terms.get(i).equals("Ans"))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * Checks if a given String can be parsed as a double.
	 * 
	 * @param term
	 *            The String to be checked.
	 * @return Whether or not the given String is a double.
	 */
	private boolean isDouble(String term)
	{
		try
		{
			Double.parseDouble(term);
		}
		catch (NumberFormatException error)
		{
			return false;
		}
		return true;
	}

	/**
	 * Finds the answer from the checked list of terms.
	 * 
	 * @param terms
	 *            The list of terms made by the createList method and checked by the checkList method.
	 * @return The answer to the equation.
	 */
	private String doMath(List<String> terms)
	{
		for (int i = 0; i < terms.size(); i++)
		{
			if (terms.get(i).equals("Ans"))
			{
				terms.set(i, answer);
			}
		}
		for (int i = 0; i < terms.size(); i++)
		{
			if (terms.get(i).equals("x"))
			{
				terms.set(i - 1, Double.parseDouble(terms.get(i - 1)) * Double.parseDouble(terms.get(i + 1)) + "");
				terms.remove(i);
				terms.remove(i);
				i--;
			}
			else if (terms.get(i).equals("/"))
			{
				terms.set(i - 1, Double.parseDouble(terms.get(i - 1)) / Double.parseDouble(terms.get(i + 1)) + "");
				terms.remove(i);
				terms.remove(i);
				i--;
			}
		}
		for (int i = 0; i < terms.size(); i++)
		{
			if (terms.get(i).equals("+"))
			{
				terms.set(i - 1, Double.parseDouble(terms.get(i - 1)) + Double.parseDouble(terms.get(i + 1)) + "");
				terms.remove(i);
				terms.remove(i);
				i--;
			}
			else if (terms.get(i).equals("-"))
			{
				terms.set(i - 1, Double.parseDouble(terms.get(i - 1)) - Double.parseDouble(terms.get(i + 1)) + "");
				terms.remove(i);
				terms.remove(i);
				i--;
			}
		}
		answer = Double.parseDouble(terms.get(0)) + "";
		return answer;
	}
}