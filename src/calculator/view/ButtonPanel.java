package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.EtchedBorder;

public class ButtonPanel extends JPanel
{
	private CalculatorController appController;
	private GridLayout numberLayout;
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	private JButton point;
	private JButton equals;
	private JButton multiply;
	private JButton divide;
	private JButton add;
	private JButton subtract;

	/**
	 * Constructor for the ButtonPanel, creates the Buttons and calls helper methods.
	 * 
	 * @param appController
	 *            the CalculatorController being used to run the project
	 */
	public ButtonPanel(CalculatorController appController)
	{
		super();
		this.appController = appController;
		numberLayout = new GridLayout(4, 4, 10, 10);
		zero = new JButton();
		one = new JButton();
		two = new JButton();
		three = new JButton();
		four = new JButton();
		five = new JButton();
		six = new JButton();
		seven = new JButton();
		eight = new JButton();
		nine = new JButton();
		point = new JButton();
		equals = new JButton();
		multiply = new JButton();
		divide = new JButton();
		add = new JButton();
		subtract = new JButton();
		setupPanel();
		setupButtons();
	}

	/**
	 * Helper method for the Constructor used to set parameters and add components to the Panel.
	 */
	private void setupPanel()
	{
		setLayout(numberLayout);
		setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.GRAY, Color.DARK_GRAY));
		setBackground(Color.LIGHT_GRAY);
		add(seven);
		add(eight);
		add(nine);
		add(divide);
		add(four);
		add(five);
		add(six);
		add(multiply);
		add(one);
		add(two);
		add(three);
		add(subtract);
		add(zero);
		add(point);
		add(equals);
		add(add);
	}

	/**
	 * Helper method for the Constructor used to set parameters for the buttons.
	 */
	private void setupButtons()
	{
		zero.setText("0");
		one.setText("1");
		two.setText("2");
		three.setText("3");
		four.setText("4");
		five.setText("5");
		six.setText("6");
		seven.setText("7");
		eight.setText("8");
		nine.setText("9");
		point.setText(".");
		equals.setText("=");
		multiply.setText("x");
		divide.setText("/");
		add.setText("+");
		subtract.setText("-");
	}
}
