package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5Swing extends JFrame {
	private JTextArea jTextAreaInput;
	private JTextArea jTextAreaResult;

	public Ex5Swing() {
		this.setLayout(new GridLayout(2, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelInput = new JPanel(new FlowLayout());
		jTextAreaInput = new JTextArea();
		jTextAreaInput.setPreferredSize(new Dimension(600, 100));
		panelInput.add(jTextAreaInput);
		this.add(panelInput);

		JPanel panelCenter = new JPanel(new FlowLayout());
		panelCenter.setPreferredSize(new Dimension(600, 50));

		JButton jButtonCountWordinText = new JButton("Hash forward 3 Ascii");
		jButtonCountWordinText.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex5.hashForward3Ascii(jTextAreaInput.getText()) + "");
			}

		});

		panelCenter.add(jButtonCountWordinText);

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
		Ex5Swing ex5Swing = new Ex5Swing();
		ex5Swing.init();
	}
}
