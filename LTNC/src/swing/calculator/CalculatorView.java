package swing.calculator;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
	private JTextField jTextField;
	private CalculatorModel model;
	private JButton jButton;

	public CalculatorView() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		model = new CalculatorModel();

		ActionListener ac = new CalculatorController(this);

		jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(400, 50));
		jTextField.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		jTextField.addActionListener(ac);
		this.add(jTextField, BorderLayout.NORTH);

		JPanel jPanelBtn = new JPanel(new GridLayout(5, 3));
		String[] arrayBtn = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "=" };
		for (int i = 0; i < arrayBtn.length; i++) {
			JButton btn = new JButton(arrayBtn[i]);
			btn.setPreferredSize(new Dimension(100, 40));
			btn.addActionListener(ac);
			jPanelBtn.add(btn);
		}
		this.add(jPanelBtn, BorderLayout.CENTER);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JButton getjButton() {
		return jButton;
	}

	public void whenUserClicked(int number) {
		this.model.whenUserClick(number);
		jTextField.setText("" + this.model.getNumer());
	}

	public void operatorPlus() {
		this.model.operatorPlus();
		jTextField.setText("" + this.model.getNumer());
	}

	public void operatorMinus() {
		this.model.operatorMinus();
		jTextField.setText("" + this.model.getNumer());
	}

	public void operatorMultiply() {
		this.model.operatorMultiply();
		jTextField.setText("" + this.model.getNumer());
	}

	public void operatorDivision() {
		this.model.operatorDivision();
		jTextField.setText("" + this.model.getNumer());
	}

	public void operatorEqual() {
		this.model.operatorEqual();
		jTextField.setText("" + this.model.getNumer());
	}

	public void init() {

	}

	public static void main(String[] args) {
		CalculatorView view = new CalculatorView();
		view.init();
	}

}
