package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex4Swing extends JFrame {
	private JTextArea jTextAreaInput;
	private JTextArea jTextArelTextResult;
	private JTextField jTextFieldlReplacedLetters;
	private JTextField jTextFieldlAlternativeLetters;

	public Ex4Swing() {
		this.setLayout(new GridLayout(3, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelInput = new JPanel(new FlowLayout());
		jTextAreaInput = new JTextArea();
		jTextAreaInput.setPreferredSize(new Dimension(600, 100));
		panelInput.add(jTextAreaInput);
		this.add(panelInput);

		JPanel panelCenter = new JPanel(new GridLayout(3, 1));

		JLabel labelReplacedLetters = new JLabel("Replaced Letters");
		panelCenter.add(labelReplacedLetters);
		jTextFieldlReplacedLetters = new JTextField();
		jTextFieldlReplacedLetters.setPreferredSize(new Dimension(200, 30));
		panelCenter.add(jTextFieldlReplacedLetters);

		JLabel labelAlternativeLetters = new JLabel("Alternative Letters");
		panelCenter.add(labelAlternativeLetters);
		jTextFieldlAlternativeLetters = new JTextField();
		jTextFieldlAlternativeLetters.setPreferredSize(new Dimension(200, 30));
		panelCenter.add(jTextFieldlAlternativeLetters);

		JButton jButtonResult = new JButton("Result");
		jButtonResult.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextArelTextResult.setText(Ex4.replaceAll(jTextAreaInput.getText(),
						jTextFieldlReplacedLetters.getText(), jTextFieldlAlternativeLetters.getText()));
			}

		});
		panelCenter.add(jButtonResult);

		this.add(panelCenter);

		JPanel panelResult = new JPanel(new FlowLayout());
		jTextArelTextResult = new JTextArea();
		jTextArelTextResult.setPreferredSize(new Dimension(600, 100));
		panelResult.add(jTextArelTextResult);
		this.add(panelResult);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex4Swing ex4Swing = new Ex4Swing();
		ex4Swing.init();
	}
}
