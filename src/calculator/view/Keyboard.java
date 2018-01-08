package calculator.view;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import calculator.controller.CalculatorController;

public class Keyboard implements KeyListener
{
	CalculatorController appController;
	DisplayPanel displayPanel;
	
	public Keyboard(CalculatorController appController, DisplayPanel displayPanel)
	{
		this.appController = appController;
		this.displayPanel = displayPanel;
	}
	
	public void keyPressed(KeyEvent e)
	{
		System.out.print("key pressed");
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_0)
		{
			displayPanel.appendText("0");
		}
		if (key == KeyEvent.VK_1)
		{
			displayPanel.appendText("1");
		}
		if (key == KeyEvent.VK_2)
		{
			displayPanel.appendText("2");
		}
		if (key == KeyEvent.VK_3)
		{
			displayPanel.appendText("3");
		}
		if (key == KeyEvent.VK_4)
		{
			displayPanel.appendText("4");
		}
		if (key == KeyEvent.VK_5)
		{
			displayPanel.appendText("5");
		}
		if (key == KeyEvent.VK_6)
		{
			displayPanel.appendText("6");
		}
		if (key == KeyEvent.VK_7)
		{
			displayPanel.appendText("7");
		}
		if (key == KeyEvent.VK_8)
		{
			displayPanel.appendText("8");
		}
		if (key == KeyEvent.VK_9)
		{
			displayPanel.appendText("9");
		}
		if (key == KeyEvent.VK_PERIOD)
		{
			displayPanel.appendText(".");
		}
		if (key == KeyEvent.VK_A)
		{
			displayPanel.appendText("Ans");
		}
		if (key == KeyEvent.VK_SLASH)
		{
			displayPanel.appendText("/");
		}
		if (key == KeyEvent.VK_X)
		{
			displayPanel.appendText("x");
		}
		if (key == KeyEvent.VK_SUBTRACT)
		{
			displayPanel.appendText("-");
		}
		if (key == KeyEvent.VK_PLUS)
		{
			displayPanel.appendText("+");
		}
		if (key == KeyEvent.VK_EQUALS)
		{
			appController.calculate();
		}
		if (key == KeyEvent.VK_C)
		{
			displayPanel.clearText();
		}
		if (key == KeyEvent.VK_BACK_SPACE)
		{
			displayPanel.backspace();
		}
		if (key == KeyEvent.VK_S)
		{
			displayPanel.changeSign();
		}
	}

	public void keyTyped(KeyEvent e)
	{
		System.out.println("key typed");
		
	}

	public void keyReleased(KeyEvent e)
	{
		System.out.println("key released");
		
	}
}
