package calculator.view;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Keyboard extends KeyAdapter implements KeyListener
{
	DisplayPanel displayPanel;
	
	public Keyboard(DisplayPanel displayPanel)
	{
		this.displayPanel = displayPanel;
	}
	
	public void keyPressed(KeyEvent e)
	{
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
	}
}
