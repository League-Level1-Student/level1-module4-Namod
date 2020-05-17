package _05_typing_tutor;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class typer implements KeyListener{
	char currentLetter;
	int currentNumber;
	JFrame JFrame = new JFrame();
	JPanel JPanel = new JPanel();
	JLabel JLabel = new JLabel();
	
	char generateRandomLetter() {
	    Random r = new Random();
	  return (char) (r.nextInt(26) + 'a');
	  
	}
	
	public typer() {
		currentLetter = generateRandomLetter();
		JLabel.setText(Character.toString(currentLetter));
		JLabel.setFont(JLabel.getFont().deriveFont(28.0f));

		JLabel.setHorizontalAlignment(SwingConstants.CENTER);
		JPanel.add(JLabel);
		JFrame.setTitle("Type or Die");
		JFrame.add(JPanel);
		JFrame.pack();
		JFrame.setVisible(true);
	JFrame.addKeyListener(this);
	
	}
	void run() {
	
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	e.getSource();
	if(e.getKeyChar()== currentLetter) {
		System.out.println("correct");
		
		}
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		JLabel.setText(Character.toString(currentLetter));
		System.out.println(e);
	}
	
	
	

}
