package calculator.view;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class DisplayPanel extends JPanel
{
	private SmartScroller smartScroll;
	private JScrollPane displayScroll;
	private JTextArea displayText;
	private SpringLayout displayLayout;
	private boolean isAnswer;
	private final String startText = "                    ";
	private final List<String> operators = new ArrayList<String>(Arrays.asList("+", "-", "x", "/"));

	/**
	 * Constructor for the display, creates the TextArea and calls helper methods.
	 * 
	 * @param appController
	 *            the CalculatorController being used to run the project
	 */
	public DisplayPanel()
	{
		super();
		displayScroll = new JScrollPane();
		displayText = new JTextArea();
		displayLayout = new SpringLayout();
		smartScroll = new SmartScroller(displayScroll, SmartScroller.HORIZONTAL, SmartScroller.END);
		isAnswer = true;
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
		displayText.setBackground(new Color(150, 180, 150));
		displayText.setFont(new Font("Lucida Grande", Font.PLAIN, 57));
		displayText.setEditable(false);
		displayText.setText(startText + '0');
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

	/**
	 * Appends the given text to the display appropriately.
	 * 
	 * @param text
	 *            The text to append.
	 */
	public void appendText(String text)
	{
		if (isAnswer)
		{
			displayText.setText(startText);
			isAnswer = false;
		}
		if (operators.contains(text))
		{
			displayText.append(" " + text + " ");
		}
		else
		{
			displayText.append(text);
		}
	}

	/**
	 * Sets the display's text to the answer properly.
	 * 
	 * @param answer
	 *            The answer to set.
	 */
	public void answer(String answer)
	{
		if (answer.length() > 11)
		{
			if (answer.contains("E"))
			{
				displayText.setText(startText + answer.substring(0, 11 - (answer.length() - answer.indexOf("E"))) + answer.substring(answer.indexOf("E"), answer.length()));
			}
			else
			{
				displayText.setText(startText + answer.substring(0, 11));
			}
		}
		else
		{
			displayText.setText(startText + answer);
		}
		isAnswer = true;
	}

	/**
	 * Resets the display's text.
	 */
	public void clearText()
	{
		displayText.setText(startText + '0');
		isAnswer = true;
	}

	/**
	 * Deletes the rightmost character on the display properly.
	 */
	public void backspace()
	{
		String text = displayText.getText();
		int length = text.length();
		if (text.charAt(length - 1) == ' ' || text.charAt(length - 1) == 's')
		{
			displayText.setText(text.substring(0, length - 3));
		}
		else
		{
			displayText.setText(text.substring(0, length - 1));
		}
		if (displayText.getText().equals(startText))
		{
			isAnswer = true;
		}
		if (isAnswer)
		{
			clearText();
		}
	}

	/**
	 * Toggles the negative sign on the current number in the display.
	 */
	public void changeSign()
	{
		if (isAnswer)
		{
			displayText.setText(startText);
		}
		String text = displayText.getText();
		int lastSpace = text.lastIndexOf(' ');
		int length = text.length();
		if (lastSpace + 1 < length)
		{
			if (text.charAt(lastSpace + 1) == '-')
			{
				displayText.setText(text.substring(0, lastSpace + 1) + text.substring(lastSpace + 2, length));
			}
			else
			{
				displayText.setText(text.substring(0, lastSpace + 1) + '-' + text.substring(lastSpace + 1, length));
			}
		}
		else
		{
			displayText.setText(text.substring(0, lastSpace + 1) + '-' + text.substring(lastSpace + 1, length));
			isAnswer = false;
		}
		if (displayText.getText().equals(startText))
		{
			clearText();

		}
	}

	/**
	 * Formats the display's text and returns it.
	 * 
	 * @return the display's formatted text.
	 */
	public String getDisplayText()
	{
		if (displayText.getText().length() > 20)
		{
			return displayText.getText().substring(20, displayText.getText().length());
		}
		else
		{
			return "";
		}
	}
}