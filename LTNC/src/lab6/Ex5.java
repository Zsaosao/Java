package lab6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex5 extends JFrame {
	private JTextField jTextFieldName;
	private JTextField jTextFieldPrint;

	private JTextField jTextFieldSexPrint;

	private JTextField jTextFieldMoney;
	private JTextField jTextFieldMoneyPrint;

	public Ex5() {
		this.setLayout(new GridLayout(3, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Top
		JPanel jPanelTop = new JPanel(new FlowLayout());

		JLabel labelTop = new JLabel("Full name");
		labelTop.setPreferredSize(new Dimension(100, 30));
		jPanelTop.add(labelTop);

		jTextFieldName = new JTextField();
		jTextFieldName.setPreferredSize(new Dimension(200, 30));
		jTextFieldName.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldPrint.setText(jTextFieldName.getText());
			}
		});
		jPanelTop.add(jTextFieldName);

		jTextFieldPrint = new JTextField();
		jTextFieldPrint.setEditable(false);
		jTextFieldPrint.setPreferredSize(new Dimension(200, 30));

		jPanelTop.add(jTextFieldPrint);

		this.add(jPanelTop);
		// Center
		JPanel jPanelCennter = new JPanel(new FlowLayout());

		JLabel labelSex = new JLabel("Sex");
		jPanelCennter.add(labelSex);
		labelSex.setPreferredSize(new Dimension(95, 30));

		JCheckBox checkBoxMale = new JCheckBox("Male");
		checkBoxMale.setPreferredSize(new Dimension(100, 30));
		checkBoxMale.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldSexPrint.setText("Male");
			}
		});
		jPanelCennter.add(checkBoxMale);

		JCheckBox checkBoxFemale = new JCheckBox("Female");
		checkBoxFemale.setPreferredSize(new Dimension(100, 30));
		checkBoxFemale.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldSexPrint.setText("Female");
			}
		});
		jPanelCennter.add(checkBoxMale);
		jPanelCennter.add(checkBoxFemale);

		ButtonGroup btnGrSex = new ButtonGroup();
		btnGrSex.add(checkBoxMale);
		btnGrSex.add(checkBoxFemale);

		jTextFieldSexPrint = new JTextField();
		jTextFieldSexPrint.setPreferredSize(new Dimension(200, 30));
		jTextFieldSexPrint.setEditable(false);
		jPanelCennter.add(jTextFieldSexPrint);

		this.add(jPanelCennter);

		// Footer
		JPanel jPanelFooter = new JPanel(new FlowLayout());

		JLabel labelFooter = new JLabel("Amount of money");
		labelFooter.setPreferredSize(new Dimension(100, 30));
		jPanelFooter.add(labelFooter);

		jTextFieldMoney = new JTextField();
		jTextFieldMoney.setPreferredSize(new Dimension(200, 30));
		jTextFieldMoney.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String formatted = String.format("%,.3f", Double.parseDouble(jTextFieldMoney.getText()));
				jTextFieldMoneyPrint.setText(formatted);
			}
		});
		jPanelFooter.add(jTextFieldMoney);

		jTextFieldMoneyPrint = new JTextField();
		jTextFieldMoneyPrint.setEditable(false);
		jTextFieldMoneyPrint.setPreferredSize(new Dimension(200, 30));

		jPanelFooter.add(jTextFieldMoneyPrint);

		this.add(jPanelFooter);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ex5 ex5 = new Ex5();
		ex5.init();
	}
}
