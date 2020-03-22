package _04_chuckle_clicker;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {

void makeButtons() {
	// TODO Auto-generated method stub
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
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
if(ActionListener == button1) {
	System.out.println("Joke");
}
else if(ActionListener == button2) {
	System.out.println("Puncnline");
}

}
//}
