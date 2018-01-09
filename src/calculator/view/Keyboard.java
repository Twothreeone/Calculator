package calculator.view;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import calculator.controller.CalculatorController;

public class Keyboard implements KeyListener
{
	CalculatorController appController;

	/**
	 * Constructor to set the appController.
	 * 
	 * @param appController
	 *            The app's CalculatorController
	 */
	public Keyboard(CalculatorController appController)
	{
		this.appController = appController;
	}

	/**
	 * Used to change the display based on keys that do output a character.
	 */
	public void keyTyped(KeyEvent e)
	{
		char key = e.getKeyChar();
		if (key == '0')
			appController.appendText("0");
		if (key == '1')
			appController.appendText("1");
		if (key == '2')
			appController.appendText("2");
		if (key == '3')
			appController.appendText("3");
		if (key == '4')
			appController.appendText("4");
		if (key == '5')
			appController.appendText("5");
		if (key == '6')
			appController.appendText("6");
		if (key == '7')
			appController.appendText("7");
		if (key == '8')
			appController.appendText("8");
		if (key == '9')
			appController.appendText("9");
		if (key == '.')
			appController.appendText(".");
		if (key == 'a' || key == 'A')
			appController.appendText("Ans");
		if (key == '/')
			appController.appendText("/");
		if (key == 'x' || key == 'X' || key == '*')
			appController.appendText("x");
		if (key == '-')
			appController.appendText("-");
		if (key == '+')
			appController.appendText("+");
		if (key == '=')
			appController.calculate();
		if (key == 'c' || key == 'C')
			appController.clearText();
		if (key == 's' || key == 'S' || key == 'n' || key == 'N' || key == 'p' || key == 'P')
			appController.changeSign();
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
			appController.backspace();
	}

	/**
	 * Not implemented
	 */
	public void keyReleased(KeyEvent e)
	{
	}
}
