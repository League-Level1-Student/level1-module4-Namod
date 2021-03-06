package _03_jeopardy;


/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

import sun.net.www.content.audio.x_aiff;


/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton, secondButton, thirdButton, fourthButton, fifthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;
	String firstQuestion = "what is the value of 1?";
	String secondQuestion ="what is the value of 2?";
	String thirdQuestion ="what is the value of 3?";
	String fourthQuestion ="what is the value of 4?";
	String fifthQuestion ="what is the value of 5?";
	JButton first;
	JButton second;
	JButton third;
	JButton fourth;
	JButton fifth;
	int x1 = 1;
	int x2 = 2;
	int x3 = 3;
	int x4 = 4;
	int x5 = 5;
	

	public void run() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Title");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel panel = createHeader("Numbers");

		// 4. Add the header component to the quizPanel
		quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		
		// 7. Add the firstButton to the quizPanel
		

		// 8. Write the code to complete the createButton() method below. Check that your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		first = createButton("$1000");
		second = createButton("$800");
		third = createButton("$600");
		fourth = createButton("$400");
		fifth = createButton("$200");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(first);
		quizPanel.add(second);
		quizPanel.add(third);
		quizPanel.add(fourth);
		quizPanel.add(fifth);
		// 11. Add action listeners to the buttons (2 lines of code)
		first.addActionListener(this);
		second.addActionListener(this);
		third.addActionListener(this);
		fourth.addActionListener(this);
		fifth.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
		
		 /*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */		
		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}


	private JButton createButton(String dollarAmount) {
		
		// Create a new JButton
		JButton button = new JButton();
		// Set the text of the button to the dollarAmount
		button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)type name = new type();
		buttonCount +=1;
		// Return your new button instead of the temporary button

		return button;
	}

	public void actionPerformed(ActionEvent e) {
		
		// Remove this temporary message after testing:
		//JOptionPane.showMessageDialog(null, "pressed " + ((JButton) e.getSource()).getText() + " button");

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		
			// Call the askQuestion() method
			
		// Complete the code in the askQuestion() method. When you play the game, the score should change.

		// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question

		// Clear the text on the button that was pressed (set the button text to nothing)if(buttonPressed == firstButton) {
		if(buttonPressed == first) {
		askQuestion(firstQuestion, "1", 1000);
		} 
		if(buttonPressed == second) {
			askQuestion(secondQuestion, "2", 800);
			
		}
		if(buttonPressed == third) {
			askQuestion(thirdQuestion, "3", 600);
			
		}
		if(buttonPressed == fourth) {
			askQuestion(fourthQuestion, "4", 400);
			
		}
		if(buttonPressed == fifth) {
			askQuestion(fifthQuestion, "5", 200);
			
		}
	}
	

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		
		// Use the playJeopardyTheme() method to play music while the use thinks of an answer
			playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user the question
		//JOptionPane.showMessageDialog(null, "this is where the question will be asked");
			if(question == firstQuestion) {
				String answer =  JOptionPane.showInputDialog(firstQuestion);
				if(answer == "1") {
					score = + prizeMoney;
					System.out.println("Correct");
				}
				else{
					score = - prizeMoney;
					System.out.println("Incorrect");
				}
			}
			if(question == secondQuestion) {
				String answer =  JOptionPane.showInputDialog(secondQuestion);
				if(answer == "2") {
					score = + prizeMoney;
					System.out.println("Correct");
				}
				else{
					score = - prizeMoney;
					System.out.println("Incorrect");
				}
			}
			if(question == thirdQuestion) {
				String answer =  JOptionPane.showInputDialog(thirdQuestion);
				if(answer == "3") {
					score = + prizeMoney;
					System.out.println("Correct");
				}
				else{
					score = - prizeMoney;
					System.out.println("Incorrect");
				}
			}
			if(question == fourthQuestion) {
				String answer =  JOptionPane.showInputDialog(fourthQuestion);
				if(answer == "4") {
					score = + prizeMoney;
					System.out.println("Correct");
				}
				
				else{
					score = - prizeMoney;
					System.out.println("Incorrect");
				}
			}
			if(question == fifthQuestion) {
				String answer =  JOptionPane.showInputDialog(fifthQuestion);
				if(answer == "5") {
					score = + prizeMoney;
					System.out.println("Correct");
				}
				else{
					score = - prizeMoney;
					System.out.println("Incorrect");
				}
			}
			
		
		// Stop the theme music when they have entered their response. Hint: use the sound variable 
		
		// If the answer is correct
			// Increase the score by the prizeMoney
			// Pop up a message to tell the user they were correct

		// Otherwise

			// Decrement the score by the prizeMoney

			// Pop up a message to tell the user they were wrong and give them the correct answer
			
		// Call the updateScore() method
			updateScore();
			JOptionPane.showMessageDialog(null, score);
	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
