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
	
	private void setupPanel()
	{
		setLayout(appLayout);
		add(displayPanel);
		add(numberPanel);
		setBackground(Color.GRAY);
		setBorder(new LineBorder(Color.LIGHT_GRAY, 3, true));
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, displayPanel, 5, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, displayPanel, -5, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, displayPanel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, displayPanel, -415, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberPanel, 10, SpringLayout.SOUTH, displayPanel);
		appLayout.putConstraint(SpringLayout.WEST, numberPanel, 5, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, numberPanel, -5, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, numberPanel, -5, SpringLayout.EAST, this);
	}
}
