package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

public class DisplayPanel extends JPanel
{
	private CalculatorController appController;
	private JScrollPane displayScroll;
	private JTextArea displayText;
	private SpringLayout displayLayout;

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
		displayScroll = new JScrollPane();
		displayText = new JTextArea();
		displayLayout = new SpringLayout();
		setupPanel();
		setupLayout();
	}

	/**
	 * Helper method for the Constructor used to set parameters for and add components to the Panel.
	 */
	private void setupPanel()
	{
		setLayout(displayLayout);
		add(displayScroll);
		displayScroll.setViewportView(displayText);
		displayScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		displayScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		displayScroll.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.GRAY, Color.DARK_GRAY));
		SmartScroller smartScroll = new SmartScroller(displayScroll, SmartScroller.HORIZONTAL, SmartScroller.END);
		displayText.setBackground(new Color(150, 180, 150));
		displayText.setFont(new Font("Lucida Grande", Font.PLAIN, 57));
		displayText.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		displayText.setEditable(false);
	}

	/**
	 * Helper method for the Constructor used to set the layout of the components.
	 */
	private void setupLayout()
	{
		displayLayout.putConstraint(SpringLayout.NORTH, displayScroll, 0, SpringLayout.NORTH, this);
		displayLayout.putConstraint(SpringLayout.WEST, displayScroll, 0, SpringLayout.WEST, this);
		displayLayout.putConstraint(SpringLayout.SOUTH, displayScroll, 0, SpringLayout.SOUTH, this);
		displayLayout.putConstraint(SpringLayout.EAST, displayScroll, 0, SpringLayout.EAST, this);
	}
}