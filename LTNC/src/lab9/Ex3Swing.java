package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex3Swing extends JFrame {
	private JTextArea jTextAreaInput;
	private JTextArea jTextArelTextCoparison;
	private JTextArea jTextAreaResult;

	public Ex3Swing() {
		this.setLayout(new GridLayout(3, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelInput = new JPanel(new FlowLayout());
		jTextAreaInput = new JTextArea();
		jTextAreaInput.setPreferredSize(new Dimension(600, 100));
		panelInput.add(jTextAreaInput);
		this.add(panelInput);

		JPanel jPanelTextCoparison = new JPanel(new FlowLayout());
		jTextArelTextCoparison = new JTextArea();
		jTextArelTextCoparison.setPreferredSize(new Dimension(600, 100));
		jPanelTextCoparison.add(jTextArelTextCoparison);
		this.add(jPanelTextCoparison);

		JPanel panelResult = new JPanel(new FlowLayout());

		jTextAreaResult = new JTextArea();
		jTextAreaResult.setPreferredSize(new Dimension(200, 30));

		JButton jButtonIndexOf = new JButton("Index Of");
		jButtonIndexOf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextAreaResult.setText(Ex3.indetOf(jTextAreaInput.getText(),
						jTextArelTextCoparison.getText()) + "");
			}

		});
		panelResult.add(jButtonIndexOf);
		panelResult.add(jTextAreaResult);

		this.add(panelResult);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex3Swing ex3Swing = new Ex3Swing();
		ex3Swing.init();
	}
}
