package calculator.view;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import calculator.controller.CalculatorController;

public class CalculatorFrame extends JFrame
{
	private CalculatorController appController;
	private CalculatorPanel appPanel;
	private Keyboard keyboard;

	/**
	 * Constructor for the Frame, creates the CalculatorPanel and calls helper methods.
	 * 
	 * @param appController
	 *            the CalculatorController being used to run the project
	 */
	public CalculatorFrame(CalculatorController appController)
	{
		super();
		this.appController = appController;
		appPanel = new CalculatorPanel(appController);
		keyboard = new Keyboard(appController);
		setupFrame();
	}

	/**
	 * Helper method for the constructor used to set parameters for the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(410, 620);
		this.setTitle("Calculator");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setResizable(false);
		this.addKeyListener(keyboard);
		this.setFocusable(true);
		this.setVisible(true);
	}

	/**
	 * @return the appPanel
	 */
	public CalculatorPanel getAppPanel()
	{
		return appPanel;
	}
}