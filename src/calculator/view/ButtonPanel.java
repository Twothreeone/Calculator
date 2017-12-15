package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class ButtonPanel extends JPanel
{
	private CalculatorController appController;
	private GridLayout numberLayout;
	private CalculatorButton zero;
	private CalculatorButton one;
	private CalculatorButton two;
	private CalculatorButton three;
	private CalculatorButton four;
	private CalculatorButton five;
	private CalculatorButton six;
	private CalculatorButton seven;
	private CalculatorButton eight;
	private CalculatorButton nine;
	private CalculatorButton point;
	private CalculatorButton multiply;
	private CalculatorButton divide;
	private CalculatorButton add;
	private CalculatorButton subtract;
	private JButton equals;
	private JButton ans;
	private JButton clear;
	private JButton backspace;
	private JButton negative;

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
		numberLayout = new GridLayout(5, 4, 10, 10);
		zero = new CalculatorButton(appController, "0", true);
		one = new CalculatorButton(appController, "1", true);
		two = new CalculatorButton(appController, "2", true);
		three = new CalculatorButton(appController, "3", true);
		four = new CalculatorButton(appController, "4", true);
		five = new CalculatorButton(appController, "5", true);
		six = new CalculatorButton(appController, "6", true);
		seven = new CalculatorButton(appController, "7", true);
		eight = new CalculatorButton(appController, "8", true);
		nine = new CalculatorButton(appController, "9", true);
		point = new CalculatorButton(appController, ".", true);
		multiply = new CalculatorButton(appController, "x", false);
		divide = new CalculatorButton(appController, "/", false);
		add = new CalculatorButton(appController, "+", false);
		subtract = new CalculatorButton(appController, "-", false);
		equals = new JButton();
		ans = new JButton();
		clear = new JButton();
		backspace = new JButton();
		negative = new JButton();
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
		add(ans);
		add(clear);
		add(backspace);
		add(divide);
		add(seven);
		add(eight);
		add(nine);
		add(multiply);
		add(four);
		add(five);
		add(six);
		add(subtract);
		add(one);
		add(two);
		add(three);
		add(add);
		add(negative);
		add(zero);
		add(point);
		add(equals);
	}
	
	private void setupButtons()
	{
		equals.setText("=");
		equals.setBackground(Color.RED);
		equals.setForeground(Color.WHITE);
		equals.setOpaque(true);
		equals.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		equals.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		ans.setText("Ans");
		ans.setBackground(Color.GREEN);
		ans.setForeground(Color.WHITE);
		ans.setOpaque(true);
		ans.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		ans.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		clear.setText("C");
		clear.setBackground(Color.GREEN);
		clear.setForeground(Color.WHITE);
		clear.setOpaque(true);
		clear.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		clear.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		backspace.setText("<--");
		backspace.setBackground(Color.GREEN);
		backspace.setForeground(Color.WHITE);
		backspace.setOpaque(true);
		backspace.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		backspace.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		negative.setText("+/-");
		negative.setBackground(Color.GRAY);
		negative.setForeground(Color.WHITE);
		negative.setOpaque(true);
		negative.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		negative.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
	}
}
