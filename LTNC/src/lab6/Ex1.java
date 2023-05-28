package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ex1 extends JFrame {
	private Ex1Model model;
	private JTextField textFieldFirstNumber;
	private JTextField textFieldSecondNumber;
	private JTextField textFieldResultNumber;

	public Ex1() {
		this.setLayout(new GridLayout(5, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.model = new Ex1Model();

		ActionListener ac = new Ex1Controll(this);

		JPanel panelFirstNumber = new JPanel(new FlowLayout());
		JLabel labelFirstNumber = new JLabel("First number ");
		textFieldFirstNumber = new JTextField();
		textFieldFirstNumber.setPreferredSize(new Dimension(300, 25));
		panelFirstNumber.add(labelFirstNumber);
		panelFirstNumber.add(textFieldFirstNumber);
		this.add(panelFirstNumber);

		JPanel panelBtnCal = new JPanel(new FlowLayout());
		String[] btn = { "+", "-", "*", "/" };
		for (int i = 0; i < btn.length; i++) {
			JButton jButtonCal = new JButton(btn[i]);
			jButtonCal.addActionListener(ac);
			panelBtnCal.add(jButtonCal);
		}
		this.add(panelBtnCal);

		JPanel panelSecondNumber = new JPanel(new FlowLayout());
		JLabel labellSecondNumber = new JLabel("Second number ");
		textFieldSecondNumber = new JTextField();
		textFieldSecondNumber.setPreferredSize(new Dimension(300, 25));
		panelSecondNumber.add(labellSecondNumber);
		panelSecondNumber.add(textFieldSecondNumber);
		this.add(panelSecondNumber);

		JPanel panelEqual = new JPanel(new FlowLayout());
		JButton jButtonEqual = new JButton("=");
		jButtonEqual.addActionListener(ac);
		panelEqual.add(jButtonEqual);
		this.add(panelEqual);

		JPanel panelResultNumber = new JPanel(new FlowLayout());
		JLabel labellResultNumber = new JLabel("Result number ");
		textFieldResultNumber = new JTextField();
		textFieldResultNumber.setPreferredSize(new Dimension(300, 25));
		panelResultNumber.add(labellResultNumber);
		panelResultNumber.add(textFieldResultNumber);
		this.add(panelResultNumber);

		this.pack();
		this.setLocationRelativeTo(null);

	}

	public void onClickOperation(String operation) {
		this.model.setOperator(operation);
	}

	public void onClickEqual() {
		this.model.setFirstNumber(Double.parseDouble(this.textFieldFirstNumber.getText()));
		this.model.setSecondNumber(Double.parseDouble(this.textFieldSecondNumber.getText()));
		this.textFieldResultNumber.setText("" + this.model.equals());
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		ex1.init();
	}
}
