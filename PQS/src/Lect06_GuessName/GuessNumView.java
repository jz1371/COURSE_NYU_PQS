package Lect06_GuessName;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuessNumView implements GuessNumListener {

	private GuessNumModel model;
	private JTextField field = new JTextField();
	private JTextArea textArea = new JTextArea();
	private JButton button = new JButton("Guess");

	public GuessNumView(GuessNumModel model) {
		this.model  = model;

		JFrame frame = new JFrame("GuessNum");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JPanel bottomPanel = new JPanel();
		bottomPanel.setLayout(new BorderLayout());
		bottomPanel.add(field, BorderLayout.CENTER);
		bottomPanel.add(button, BorderLayout.EAST);

		panel.add(bottomPanel, BorderLayout.SOUTH);
		panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
		frame.getContentPane().add(panel);
		frame.setSize(200, 200);
		// CLOSE when frame is close.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				// TODO Auto-generated method stub
				buttonPressed();
			}

		});

		frame.setVisible(true);

		model.addGuessNumListener(this);
		
	}

	private void buttonPressed() {
		if (field.getText() != null && !field.getText().equals("")) {
			int guess = Integer.parseInt(field.getText());
			model.checkGuess(guess);
		}
	}

	@Override
	public void guessTooHigh(int guess) {
		// TODO Auto-generated method stub
		textArea.append(guess+ " is too high\n");
	}

	@Override
	public void guessTooLow(int guess) {
		// TODO Auto-generated method stub
		textArea.append(guess+ " is too low\n");
	}

	@Override
	public void guessRight(int guess) {
		// TODO Auto-generated method stub
		textArea.append("Correct Guess! (" + guess + ")\n");
	}

	@Override
	public void gameStarted() {
		// TODO Auto-generated method stub
		textArea.append("Game started!\n");
	}

}
