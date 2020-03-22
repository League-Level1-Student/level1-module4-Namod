package _04_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle {
public static void main(String[] args) {
	
	makeButtons();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	frame.add(panel);
	frame.add(button1);
	frame.add(button2);
	frame.setTitle("Chuckle Clicker");
	button1.setText("Joke");
	button2.setText("Punchline");
	button1.addActionListener(this);
	button2.addActionListener(this);
	if(actionListener) == button1 && actionListener == button2){
		JOptionPane.showMessageDialog(null, "Hi");
		
	}
		JOptionPane.showMessageDialog(null,"Make Buttons");
	 Chuckle chuck = new Chuckle();
}

private static void makeButtons() {
	// TODO Auto-generated method stub
	
}
}
