package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import java.awt.Color;

public class DisplayPanel extends JPanel
{
	private CalculatorController appController;

	/**
	 * Constructor for the display, creates the TextArea and calls helper methods.
	 * 
	 * @param appController
	 *            the CalculatorController being used to run the project
	 */
	public DisplayPanel(CalculatorController appController)
	{
		super();
		this.appController = appController;
		setupPanel();
		setupLayout();
	}

	/**
	 * Helper method for the Constructor used to set parameters for and add components to the Panel.
	 */
	private void setupPanel()
	{

	}

	/**
	 * Helper method for the Constructor used to set the layout of the components.
	 */
	private void setupLayout()
	{

	}
}
