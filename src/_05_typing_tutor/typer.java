package _05_typing_tutor;

import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typer {
	char currentLetter;
	int currentNumber;
	JFrame JFrame = new JFrame();
	JPanel JPanel = new JPanel();
	JLabel JLabel = new JLabel();	
	
	void typer() {
		JLabel.setFont(JLabel.getFont().deriveFont(28.0f)); 
		JLabel.setHorizontalAlignment(JLabel.CENTER);
		JPanel.add(JLabel);
		JFrame.setTitle("Type or Die");
		JFrame.add(JPanel);
		JFrame.pack();
		JFrame.setVisible(true);
	}
	
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');

	}

}
