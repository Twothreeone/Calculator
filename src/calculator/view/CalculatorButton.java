package calculator.view;

import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import calculator.controller.CalculatorController;
import java.awt.Font;
import javax.swing.border.CompoundBorder;
import java.awt.event.*;

public class CalculatorButton extends JButton
{
	private CalculatorController appController;
	private Color background;

	public CalculatorButton(CalculatorController appController, String text, Color background)
	{
		super();
		this.appController = appController;
		setText(text);
		this.background = background;
		setBackground(background);
		setForeground(Color.WHITE);
		setOpaque(true);
		setFont(new Font("Lucida Grande", Font.PLAIN, 50));
		if (text.length() > 1)
		{
			setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		}
		setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
		setupListeners();
	}

	private void setupListeners()
	{
		addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent click)
			{
				appController.appendText(getText());
				appController.refocus();
			}

			public void mousePressed(MouseEvent onClick)
			{
				setBackground(background.darker());
			}

			public void mouseReleased(MouseEvent offClick)
			{
				setBackground(background);
			}

			public void mouseEntered(MouseEvent enter)
			{
				setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.WHITE, 3)));
			}

			public void mouseExited(MouseEvent exit)
			{
				setBorder(new CompoundBorder(new LineBorder(Color.LIGHT_GRAY, 5), new LineBorder(Color.BLACK, 3)));
			}
		});
	}
}