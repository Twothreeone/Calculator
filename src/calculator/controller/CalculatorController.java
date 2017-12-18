package calculator.controller;

import calculator.view.CalculatorFrame;
import calculator.view.DisplayPanel;
import calculator.model.CalculatorMath;

public class CalculatorController
{
	private CalculatorFrame appFrame;
	private DisplayPanel displayPanel;
	private CalculatorMath calculator;

	/**
	 * Constructor, creates the CalculatorFrame.
	 */
	public CalculatorController()
	{
		appFrame = new CalculatorFrame(this);
		displayPanel = appFrame.getAppPanel().getDisplayPanel();
		calculator = new CalculatorMath();
	}
	
	public void appendText(String text)
	{
		displayPanel.appendText(text);
	}
	
	public void calculate()
	{
		displayPanel.answer(calculator.calculate(displayPanel.getDisplayText()));
	}
	
	public void clearText()
	{
		displayPanel.clearText();
	}
	
	public void backspace()
	{
		displayPanel.backspace();
	}
	
	public void changeSign()
	{
		displayPanel.changeSign();
	}
}
