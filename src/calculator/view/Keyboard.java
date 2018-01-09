package calculator.view;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import calculator.controller.CalculatorController;

public class Keyboard implements KeyListener
{
	CalculatorController appController;
	DisplayPanel displayPanel;

	/**
	 * Constructor to set data members.
	 * 
	 * @param appController
	 *            The app's CalculatorController
	 * @param displayPanel
	 *            The app's DisplayPanel
	 */
	public Keyboard(CalculatorController appController, DisplayPanel displayPanel)
	{
		this.appController = appController;
		this.displayPanel = displayPanel;
	}

	/**
	 * Used to change the display based on keys that do output a character.
	 */
	public void keyTyped(KeyEvent e)
	{
		char key = e.getKeyChar();
		if (key == '0')
			displayPanel.appendText("0");
		if (key == '1')
			displayPanel.appendText("1");
		if (key == '2')
			displayPanel.appendText("2");
		if (key == '3')
			displayPanel.appendText("3");
		if (key == '4')
			displayPanel.appendText("4");
		if (key == '5')
			displayPanel.appendText("5");
		if (key == '6')
			displayPanel.appendText("6");
		if (key == '7')
			displayPanel.appendText("7");
		if (key == '8')
			displayPanel.appendText("8");
		if (key == '9')
			displayPanel.appendText("9");
		if (key == '.')
			displayPanel.appendText(".");
		if (key == 'a' || key == 'A')
			displayPanel.appendText("Ans");
		if (key == '/')
			displayPanel.appendText("/");
		if (key == 'x' || key == 'X' || key == '*')
			displayPanel.appendText("x");
		if (key == '-')
			displayPanel.appendText("-");
		if (key == '+')
			displayPanel.appendText("+");
		if (key == '=')
			appController.calculate();
		if (key == 'c' || key == 'C')
			displayPanel.clearText();
		if (key == 's' || key == 'S' || key == 'n' || key == 'N' || key == 'p' || key == 'P')
			displayPanel.changeSign();
	}

	/**
	 * Used to change the display based on keys that don't output a character.
	 */
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_ENTER)
			appController.calculate();
		if (key == KeyEvent.VK_BACK_SPACE || key == KeyEvent.VK_DELETE)
			displayPanel.backspace();
	}

	/**
	 * Not implemented
	 */
	public void keyReleased(KeyEvent e)
	{
	}
}
