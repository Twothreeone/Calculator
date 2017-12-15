package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;

public class CalculatorPanel extends JPanel
{
	private CalculatorController appController;
	
	public CalculatorPanel(CalculatorController appController)
	{
		super();
		this.appController = appController;
	}
}
