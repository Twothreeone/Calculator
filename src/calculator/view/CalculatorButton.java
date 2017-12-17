package calculator.view;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import calculator.controller.CalculatorController;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorButton extends JButton
{
	private CalculatorController appController;

	public CalculatorButton(CalculatorController appController, String text, boolean isNumber)
	{
		super();
		this.appController = appController;
		setText(text);
		if (isNumber)
		{
			setBackground(Color.GRAY);
		}
		else
		{
			setBackground(Color.BLUE);
		}
		setForeground(Color.WHITE);
		setOpaque(true);
		setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		setupListeners();
	}

	private void setupListeners()
	{
		addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				appController.appendText();
			}
		});
	}
}
