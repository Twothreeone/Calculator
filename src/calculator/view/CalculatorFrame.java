package calculator.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import calculator.controller.CalculatorController;

public class CalculatorFrame extends JFrame
{
	private CalculatorController appController;
	private CalculatorPanel appPanel;

	
	public CalculatorFrame(CalculatorController appController)
	{
		super();
		this.appController = appController;
		appPanel = new CalculatorPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(350,500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.setVisible(true);
	}
}
