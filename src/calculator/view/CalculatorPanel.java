package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class CalculatorPanel extends JPanel
{
	private CalculatorController appController;
	private SpringLayout appLayout;
	private DisplayPanel displayPanel;
	private ButtonPanel numberPanel;

	/**
	 * Constructor for the main Panel, creates the sub Panels and calls helper methods.
	 * 
	 * @param appController
	 *            the CalculatorController being used to run the project
	 */
	public CalculatorPanel(CalculatorController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		displayPanel = new DisplayPanel(appController);
		numberPanel = new ButtonPanel(appController);
		setupPanel();
		setupLayout();
	}

	/**
	 * Helper method for the Constructor used to set parameters and add components to the Panel.
	 */
	private void setupPanel()
	{
		setLayout(appLayout);
		add(displayPanel);
		add(numberPanel);
		setBackground(Color.GRAY);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
	}

	/**
	 * Helper method for the Constructor used to set the layout of the components.
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, displayPanel, 5, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, displayPanel, -5, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, displayPanel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, displayPanel, -515, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberPanel, 10, SpringLayout.SOUTH, displayPanel);
		appLayout.putConstraint(SpringLayout.WEST, numberPanel, 5, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberPanel, -5, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberPanel, -5, SpringLayout.EAST, this);
	}

	/**
	 * @return the displayPanel
	 */
	public DisplayPanel getDisplayPanel()
	{
		return displayPanel;
	}
}
