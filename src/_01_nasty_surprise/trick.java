package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class trick implements ActionListener {
JLabel TrickImage = null;
	JLabel TreatImage = null ; 
	JFrame object = new JFrame();
	JPanel object2 = new JPanel();
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	String Trick = "Trick.jpg";
	String Treat = "Treat.jpg";
	public void run() {
		
	

	
	object.setVisible(true);
	object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	object.setSize(500,500);
	object.setTitle("Trick/Treat");

	object.add(object2);
	String Trick = "Trick.jpg";
	String Treat = "Treat.jpg";
	object2.add(TrickImage);
	object2.add(TreatImage);
	leftButton.addActionListener(this);
	rightButton.addActionListener(this);
	rightButton.setText("Trick");
	leftButton.setText("Treat");
	object2.add(leftButton);
	object2.add(rightButton);
	object.pack();
}
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL("https://live.staticflickr.com/2073/2254850697_22de181296_b.jpg");
	        URL url2 = new URL("https://i.pinimg.com/originals/09/df/f2/09dff222d763d10bebcde24c519bae81.jpg");
	        Icon icon = new ImageIcon(url);  Icon icon2 = new ImageIcon(url2);
	        JLabel imageLabel = new JLabel(icon);JLabel imageLabel1 = new JLabel(icon2);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel1);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
		/* If the buttonPressed was the leftButton.... */
	// Set the text of the rightButton to "No, click Me!"
	// Set the PREFERRED size of the rightButton to BIG
	// Set the text of the leftButton to "Click Me!"
	// Set the PREFERRED size of the leftButton to SMALL

	/* If the buttonPressed was the rightButton, do the opposite. */

	
}
