package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2Swing extends JFrame {
	private JTextArea jTextAreaInput;
	private JTextArea jTextAreaResult;

	public Ex2Swing() {
		this.setLayout(new GridLayout(2, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelInput = new JPanel(new FlowLayout());
		jTextAreaInput = new JTextArea();
		jTextAreaInput.setPreferredSize(new Dimension(600, 100));
		panelInput.add(jTextAreaInput);
		this.add(panelInput);

		JPanel panelCenter = new JPanel(new FlowLayout());
		panelCenter.setPreferredSize(new Dimension(600, 50));

		JButton jButtonToUpCase = new JButton("To Up Case");
		jButtonToUpCase.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex2.toUperCase(jTextAreaInput.getText()) + "");
			}

		});
		JButton jButtonStandardizedData = new JButton("Standardized Data");
		jButtonStandardizedData.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex2.standardizedData(jTextAreaInput.getText()) + "");
			}

		});

		JButton jButtonStandardizedSpace = new JButton("Standardized Space");
		jButtonStandardizedSpace.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex2.standardizedSpace(jTextAreaInput.getText()) + "");
			}

		});

		panelCenter.add(jButtonToUpCase);
		panelCenter.add(jButtonStandardizedData);
		panelCenter.add(jButtonStandardizedSpace);

		JPanel jPanelResult = new JPanel(new FlowLayout());
		jTextAreaResult = new JTextArea();
		jTextAreaResult.setPreferredSize(new Dimension(600, 100));
		jPanelResult.add(jTextAreaResult);

		panelCenter.add(jPanelResult);

		this.add(panelCenter);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex2Swing ex2Swing = new Ex2Swing();
		ex2Swing.init();
	}
}
