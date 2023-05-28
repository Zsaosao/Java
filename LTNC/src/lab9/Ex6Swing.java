package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex6Swing extends JFrame {
	private JTextArea jTextAreaInput;
	private JTextArea jTextAreaResult;
	private JTextField JTextFieldK;
	private JTextField JTextFieldL;

	public Ex6Swing() {
		this.setLayout(new GridLayout(3, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelInput = new JPanel(new FlowLayout());
		jTextAreaInput = new JTextArea();
		jTextAreaInput.setPreferredSize(new Dimension(600, 100));
		panelInput.add(jTextAreaInput);
		this.add(panelInput);

		JPanel panelCenter = new JPanel(new GridLayout(3, 1));
		panelCenter.setPreferredSize(new Dimension(600, 50));

		JLabel jLabelK = new JLabel("Increase k");
		panelCenter.add(jLabelK);
		JTextFieldK = new JTextField();
		JTextFieldK.setPreferredSize(new Dimension(200, 30));
		panelCenter.add(JTextFieldK);

		JLabel jLabelL = new JLabel("reduce l");
		panelCenter.add(jLabelL);
		JTextFieldL = new JTextField();
		JTextFieldL.setPreferredSize(new Dimension(200, 30));
		panelCenter.add(JTextFieldL);

		JButton jButtonCountWordinText = new JButton("Hash plus k minus l");
		jButtonCountWordinText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex6.hashPlusKMinusL(jTextAreaInput.getText(),
						Integer.parseInt(JTextFieldK.getText()),
						Integer.parseInt(JTextFieldL.getText())));
			}

		});

		panelCenter.add(jButtonCountWordinText);
		this.add(panelCenter);

		JPanel jPanelResult = new JPanel(new FlowLayout());
		jTextAreaResult = new JTextArea();
		jTextAreaResult.setPreferredSize(new Dimension(600, 100));
		jPanelResult.add(jTextAreaResult);

		this.add(jPanelResult);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex6Swing ex6Swing = new Ex6Swing();
		ex6Swing.init();
	}
}
