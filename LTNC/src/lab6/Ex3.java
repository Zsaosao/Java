package lab6;

import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {
	public Ex3() {
		this.setLayout(new GridLayout(3, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelMenu = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelMenu.setBackground(Color.LIGHT_GRAY);

		JMenuBar menuBarOperation = new JMenuBar();

		JMenu menuOperation = new JMenu("Operation");
		menuOperation.setPreferredSize(new Dimension(100, 30));

		ImageIcon iconAdd = new ImageIcon(new ImageIcon("src\\asset\\picture\\add.jpg").getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		menuOperation.add(new JMenuItem("Add CTRl A", iconAdd));

		ImageIcon iconSubtract = new ImageIcon(new ImageIcon("src\\asset\\picture\\subtract.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		menuOperation.add(new JMenuItem("Subtract CTRl S", iconSubtract));

		ImageIcon iconMultiply = new ImageIcon(new ImageIcon("src\\asset\\picture\\multiply.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		menuOperation.add(new JMenuItem("Multiply CTRl M", iconMultiply));

		ImageIcon iconDivide = new ImageIcon(new ImageIcon("src\\asset\\picture\\divide.png").getImage()
				.getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		menuOperation.add(new JMenuItem("Divide CTRl D", iconDivide));

		JMenu exitMenu = new JMenu("Exit");
		exitMenu.setPreferredSize(new Dimension(50, 30));

		menuBarOperation.add(menuOperation);
		menuBarOperation.add(exitMenu);

		panelMenu.add(menuBarOperation);

		this.add(panelMenu);

		JPanel panelCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		String[] labelArray = { "Number 1", "Number 2", "Result" };
		for (int i = 0; i < labelArray.length; i++) {
			JLabel label = new JLabel(labelArray[i]);
			JTextField textField = new JTextField();
			textField.setPreferredSize(new Dimension(100, 30));
			panelCenter.add(label);
			panelCenter.add(textField);
		}
		this.add(panelCenter);

		JPanel panelFooter = new JPanel(new FlowLayout(FlowLayout.LEFT));
		String[] operatorBtn = { "Add", "Subtract", "Multiply", "Divide" };
		for (int i = 0; i < operatorBtn.length; i++) {
			JButton buttonOperator = new JButton(operatorBtn[i]);
			buttonOperator.setPreferredSize(new Dimension(150, 30));
			panelFooter.add(buttonOperator);
		}
		this.add(panelFooter);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	private void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		ex3.init();
	}
}
