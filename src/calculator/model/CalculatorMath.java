package calculator.model;

import java.util.List;
import java.util.ArrayList;

public class CalculatorMath
{	
	public String calculate(String equation)
	{
		List<String> terms = createList(equation);
		if (!checkList(terms))
		{
			return "Syntax Error";
		}
		return "42";
	}
	
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
	
	private boolean checkList(List<String> terms)
	{
		if (terms.size() % 2 == 0)
		{
			return false;
		}
		for (int i = 0; i < terms.size(); i += 2)
		{
			if(!isDouble(terms.get(i)) && !terms.get(i).equals("Ans"))
			{
				return false;
			}
		}
		return true;
	}
	
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
}