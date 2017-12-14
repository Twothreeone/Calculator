package calculator.view;

import javax.swing.JFrame;
import calculator.controller.CalculatorController;

public class CalculatorFrame extends JFrame
{
	private CalculatorController appController;
	private CalculatorPanel appPanel;
	
	public CalculatorFrame(CalculatorController appController)
	{
		this.appController = appController;
	}
	
	private void setupFrame()
	{
		
	}
}
