package calculator.controller;

import calculator.view.CalculatorFrame;

public class CalculatorController
{
	private CalculatorFrame appFrame;

	/**
	 * Constructor, creates the CalculatorFrame.
	 */
	public CalculatorController()
	{
		appFrame = new CalculatorFrame(this);
	}
	
	public void appendText()
	{
		
	}
}
