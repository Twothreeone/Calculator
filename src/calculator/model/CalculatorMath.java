package calculator.model;

import java.util.List;
import java.util.ArrayList;

public class CalculatorMath
{	
	String answer;
	
	public CalculatorMath()
	{
		answer = "0";
	}
	
	public String calculate(String equation)
	{
		List<String> terms = createList(equation);
		if (!checkList(terms))
		{
			return "Syntax Error";
		}
		return doMath(terms);
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
	
	private String doMath(List<String> terms)
	{
		for (int i = 0; i < terms.size(); i++)
		{
			if (terms.get(i).equals("Ans"))
			{
				terms.set(i, answer);
			}
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