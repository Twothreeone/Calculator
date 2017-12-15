package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import java.awt.Color;

public class DisplayPanel extends JPanel
{
	private CalculatorController appController;
	
	public DisplayPanel(CalculatorController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{

	}
	
	private void setupLayout()
	{
		
	}
}
