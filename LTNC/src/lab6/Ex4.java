package lab6;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex4 extends JFrame {
	int RGB = 0;
	private JLabel labelRed;
	private JLabel labelYellow;
	private JLabel labelBlue;

	public Ex4() {
		this.setLayout(new GridLayout(2, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelTop = new JPanel(new GridLayout(3, 1));

		labelRed = new JLabel("Red");
		panelTop.add(labelRed);
		labelYellow = new JLabel("Yellow");
		panelTop.add(labelYellow);
		labelBlue = new JLabel("Blue");
		panelTop.add(labelBlue);

		panelTop.setBorder(new TitledBorder("Thay đổi tín hiệu đèn giao thông"));
		this.add(panelTop);

		JPanel panelCentter = new JPanel(new FlowLayout(FlowLayout.LEFT));

		JLabel labelCentter = new JLabel("Choose type of lamp: ");
		panelCentter.add(labelCentter);

		JCheckBox checkBoxRed = new JCheckBox("Red");
		panelCentter.add(checkBoxRed);
		checkBoxRed.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RGB = 1;
				setColor();
			}
		});
		JCheckBox checkBoxYellow = new JCheckBox("Yellow");
		panelCentter.add(checkBoxYellow);
		checkBoxYellow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RGB = 2;
				setColor();
			}
		});
		JCheckBox checkBoxBlue = new JCheckBox("Blue");
		checkBoxBlue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RGB = 3;
				setColor();
			}
		});
		panelCentter.add(checkBoxBlue);

		ButtonGroup btnGrRYB = new ButtonGroup();
		btnGrRYB.add(checkBoxRed);
		btnGrRYB.add(checkBoxBlue);
		btnGrRYB.add(checkBoxYellow);

		this.add(panelCentter);

		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void setColor() {
		this.labelRed.setText("Red");
		this.labelYellow.setText("Yellow");
		this.labelBlue.setText("Blue");
		if (this.RGB == 1) {
			this.labelRed.setText("Red: You choose red");
		} else if (this.RGB == 2) {
			this.labelYellow.setText("Yellow: You choose yellow");
		} else if (this.RGB == 3) {
			this.labelBlue.setText("Blue: You choose blue");
		}
	}

	private void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
		ex4.init();
	}

}
