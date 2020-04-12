package _04_chuckle_clicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
void makeButtons() {
	// TODO Auto-generated method stub

	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	//frame.add(button1);
	//frame.add(button2);
	frame.setTitle("Chuckle Clicker");
	button1.setText("Joke");
	button2.setText("Punchline");
	button1.addActionListener(this);
	button2.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
JButton buttonClicked = (JButton)e.getSource();
	if(buttonClicked.equals(button1)) {
		JOptionPane.showMessageDialog(null, "When does a joke become a 'Dad Joke'?");
		System.out.println("Button1 Pressed");
	}
	 if (buttonClicked.equals(button2)) {	
			JOptionPane.showMessageDialog(null, "When the punchline becomes A-Parent");
			System.out.println("Button2 Pressed");
	 }
		}
	
		
}

