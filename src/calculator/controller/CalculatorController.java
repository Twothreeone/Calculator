package calculator.controller;

import calculator.view.CalculatorFrame;
import calculator.view.DisplayPanel;
import calculator.model.Calculator;

public class CalculatorController
{
	private CalculatorFrame appFrame;
	private DisplayPanel displayPanel;
	private Calculator calculator;

	/**
	 * Constructor, creates the CalculatorFrame.
	 */
	public CalculatorController()
	{
		appFrame = new CalculatorFrame(this);
		displayPanel = appFrame.getAppPanel().getDisplayPanel();
		calculator = new Calculator();
	}

	/**
	 * Calls the appendText method.
	 * 
	 * @param text
	 *            The text to append to the display.
	 */
	public void appendText(String text)
	{
		displayPanel.appendText(text);
	}

	/**
	 * Calls the answer method passing through the answer given by the calculator.
	 */
	public void calculate()
	{
		displayPanel.answer(calculator.calculate(displayPanel.getDisplayText()));
	}

	/**
	 * Calls the clearText method.
	 */
	public void clearText()
	{
		displayPanel.clearText();
	}

	/**
	 * Calls the backspace method.
	 */
	public void backspace()
	{
		displayPanel.backspace();
	}

	/**
	 * Calls the changeSign method.
	 */
	public void changeSign()
	{
		displayPanel.changeSign();
	}

	/**
	 * Refocuses onto the app's CalculatorFrame so the KeyListener listens.
	 */
	public void refocus()
	{
		appFrame.requestFocus();
	}
}