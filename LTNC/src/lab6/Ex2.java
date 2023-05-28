package lab6;

import javax.swing.*;
import java.awt.*;

public class Ex2 extends JFrame {

	public Ex2() {
		this.setLayout(new GridLayout(1, 2));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 300);

		JButton btnLeft = new JButton("Food to be placed here");
		this.add(btnLeft);

		JPanel panelRight = new JPanel(new BorderLayout());

		JTextField labelRight = new JTextField();
		labelRight.setPreferredSize(new Dimension(300, 50));
		panelRight.add(labelRight, BorderLayout.NORTH);

		JPanel panelBtn = new JPanel(new GridLayout(4, 3));
		String[] btn = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "Start", "Stop" };
		for (int i = 0; i < btn.length; i++) {
			JButton jButtonBtn = new JButton(btn[i]);
			panelBtn.add(jButtonBtn);
		}
		panelRight.add(panelBtn, BorderLayout.CENTER);
		this.add(panelRight);

		this.setLocationRelativeTo(null);
	}

	private void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex2 ex2 = new Ex2();
		ex2.init();
	}

}
