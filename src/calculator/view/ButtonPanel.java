package calculator.view;

import calculator.controller.CalculatorController;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
	private CalculatorButton ans;
	private JButton equals;
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
		zero = new CalculatorButton(appController, "0", Color.GRAY);
		one = new CalculatorButton(appController, "1", Color.GRAY);
		two = new CalculatorButton(appController, "2", Color.GRAY);
		three = new CalculatorButton(appController, "3", Color.GRAY);
		four = new CalculatorButton(appController, "4", Color.GRAY);
		five = new CalculatorButton(appController, "5", Color.GRAY);
		six = new CalculatorButton(appController, "6", Color.GRAY);
		seven = new CalculatorButton(appController, "7", Color.GRAY);
		eight = new CalculatorButton(appController, "8", Color.GRAY);
		nine = new CalculatorButton(appController, "9", Color.GRAY);
		point = new CalculatorButton(appController, ".", Color.GRAY);
		multiply = new CalculatorButton(appController, "x", Color.BLUE);
		divide = new CalculatorButton(appController, "/", Color.BLUE);
		add = new CalculatorButton(appController, "+", Color.BLUE);
		subtract = new CalculatorButton(appController, "-", Color.BLUE);
		ans = new CalculatorButton(appController, "Ans", new Color(0, 170, 100));
		equals = new JButton();
		clear = new JButton();
		backspace = new JButton();
		negative = new JButton();
		setupPanel();
		setupButtons();
		setupListeners();
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
		clear.setText("C");
		clear.setBackground(new Color(0, 170, 100));
		clear.setForeground(Color.WHITE);
		clear.setOpaque(true);
		clear.setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		clear.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		backspace.setText("<--");
		backspace.setBackground(new Color(0, 170, 100));
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

	private void setupListeners()
	{
		equals.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent click)
			{
				appController.calculate();
			}

			public void mousePressed(MouseEvent onClick)
			{
				equals.setBackground(Color.RED.darker());
			}

			public void mouseReleased(MouseEvent offClick)
			{
				equals.setBackground(Color.RED);
			}

			public void mouseEntered(MouseEvent enter)
			{
				equals.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.WHITE, 3)));
			}

			public void mouseExited(MouseEvent exit)
			{
				equals.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
			}
		});
		clear.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent click)
			{
				appController.clearText();
			}

			public void mousePressed(MouseEvent onClick)
			{
				clear.setBackground(new Color(0, 170, 100).darker());
			}

			public void mouseReleased(MouseEvent offClick)
			{
				clear.setBackground(new Color(0, 170, 100));
			}

			public void mouseEntered(MouseEvent enter)
			{
				clear.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.WHITE, 3)));
			}

			public void mouseExited(MouseEvent exit)
			{
				clear.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
			}
		});
		backspace.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent click)
			{
				appController.backspace();
			}

			public void mousePressed(MouseEvent onClick)
			{
				backspace.setBackground(new Color(0, 170, 100).darker());
			}

			public void mouseReleased(MouseEvent offClick)
			{
				backspace.setBackground(new Color(0, 170, 100));
			}

			public void mouseEntered(MouseEvent enter)
			{
				backspace.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.WHITE, 3)));
			}

			public void mouseExited(MouseEvent exit)
			{
				backspace.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
			}
		});
		negative.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent click)
			{
				appController.changeSign();
			}

			public void mousePressed(MouseEvent onClick)
			{
				negative.setBackground(Color.GRAY.darker());
			}

			public void mouseReleased(MouseEvent offClick)
			{
				negative.setBackground(Color.GRAY);
			}

			public void mouseEntered(MouseEvent enter)
			{
				negative.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.WHITE, 3)));
			}

			public void mouseExited(MouseEvent exit)
			{
				negative.setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
			}
		});
	}
}