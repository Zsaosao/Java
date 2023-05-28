package lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProgram extends JFrame {
	private JTextField jTextFieldInput;
	private JTextField jTextFieldInputIsAnagrams;
	private JTextField jTextFieldResuld;

	public MainProgram() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel jPanelInput = new JPanel(new GridLayout(2, 1));
		jTextFieldInput = new JTextField();
		jTextFieldInput.setPreferredSize(new Dimension(600, 50));

		jTextFieldInputIsAnagrams = new JTextField();
		jTextFieldInputIsAnagrams.setPreferredSize(new Dimension(600, 50));

		jPanelInput.add(jTextFieldInput);
		jPanelInput.add(jTextFieldInputIsAnagrams);
		this.add(jPanelInput, BorderLayout.NORTH);

		JPanel jPanelAllButton = new JPanel(new GridLayout(6, 4));
		JButton jButtonEx1 = new JButton("Ex1 ReversevString");
		jButtonEx1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText(Ex1.reverseString(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx2 = new JButton("Ex2 isPalindrome");
		jButtonEx2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex2.isPalindrome(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx3 = new JButton("Ex3 countVowelsAndconsonant ");
		jButtonEx3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText(
						"Vowels: " + Ex3.countVowelsAndconsonant(jTextFieldInput.getText())[0] + " Consonant: " + Ex3
								.countVowelsAndconsonant(jTextFieldInput.getText())[1]);
			}
		});

		JButton jButtonEx4 = new JButton("Ex4 findlargestWord");
		jButtonEx4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex4.findlargestWord(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx5 = new JButton("Ex5 isAnagrams");
		jButtonEx5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld
						.setText("" + Ex5.isAnagrams(jTextFieldInput.getText(), jTextFieldInputIsAnagrams.getText()));
			}
		});

		JButton jButtonEx6 = new JButton("Ex6 standardizedSpace");
		jButtonEx6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex6.standardizedSpace(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx7 = new JButton("Ex7 countSecondMostFrequent");
		jButtonEx7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex7.countSecondMostFrequent(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx8 = new JButton("Ex8 removeFirstAndLastCharacter");
		jButtonEx8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex8.removeFirstAndLastCharacter(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx9 = new JButton("Ex9 countNumberofWords");
		jButtonEx9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex9.countNumberofWords(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx10 = new JButton("Ex10 isContainsOnlyDigits");
		jButtonEx10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex10.isContainsOnlyDigits(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx11 = new JButton("Ex11 countsTheNumberOfVowels");
		jButtonEx11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex11.countsTheNumberOfVowels(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx12 = new JButton("Ex12 reverseString");
		jButtonEx12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex12.reverseString(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx13 = new JButton("Ex13 isAnagrams");
		jButtonEx13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld
						.setText("" + Ex13.isAnagrams(jTextFieldInput.getText(), jTextFieldInputIsAnagrams.getText()));
			}
		});

		JButton jButtonEx14 = new JButton("Ex14 deleteAllSpace");
		jButtonEx14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex14.deleteAllSpace(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx15 = new JButton("Ex15 standardizedData");
		jButtonEx15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex15.standardizedData(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx16 = new JButton("Ex16 isPalindrome");
		jButtonEx16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex16.isPalindrome(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx17 = new JButton("Ex17 getAllSubstring");
		jButtonEx17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StringBuilder str = new StringBuilder();
				String[] strArrayAnwser = Ex17.getAllSubstring(jTextFieldInput.getText());
				for (int i = 0; i < strArrayAnwser.length; i++) {
					str.append(strArrayAnwser[i] + " ");
				}
				jTextFieldResuld.setText(str.toString());

			}
		});

		JButton jButtonEx18 = new JButton("Ex18 reverseString");
		jButtonEx18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex18.reverseString(jTextFieldInput.getText()));
			}
		});

		JButton jButtonEx19 = new JButton("Ex19 concatString");
		jButtonEx19.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex19.concatString(jTextFieldInput.getText(),
						jTextFieldInputIsAnagrams.getText()));
			}
		});

		JButton jButtonEx20 = new JButton("Ex20 removesAllTheSpecialCharacters");
		jButtonEx20.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jTextFieldResuld.setText("" + Ex20.removesAllTheSpecialCharacters(jTextFieldInput.getText()));
			}
		});

		JButton jButtonExit = new JButton("Exit");
		jButtonExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				windowClosing();
			}
		});

		jPanelAllButton.add(jButtonEx1);
		jPanelAllButton.add(jButtonEx2);
		jPanelAllButton.add(jButtonEx3);
		jPanelAllButton.add(jButtonEx4);
		jPanelAllButton.add(jButtonEx5);
		jPanelAllButton.add(jButtonEx6);
		jPanelAllButton.add(jButtonEx7);
		jPanelAllButton.add(jButtonEx8);
		jPanelAllButton.add(jButtonEx9);
		jPanelAllButton.add(jButtonEx10);
		jPanelAllButton.add(jButtonEx11);
		jPanelAllButton.add(jButtonEx12);
		jPanelAllButton.add(jButtonEx13);
		jPanelAllButton.add(jButtonEx14);
		jPanelAllButton.add(jButtonEx15);
		jPanelAllButton.add(jButtonEx16);
		jPanelAllButton.add(jButtonEx17);
		jPanelAllButton.add(jButtonEx18);
		jPanelAllButton.add(jButtonEx19);
		jPanelAllButton.add(jButtonEx20);
		jPanelAllButton.add(jButtonExit);

		jPanelAllButton.setPreferredSize(new Dimension(800, 200));
		this.add(jPanelAllButton, BorderLayout.CENTER);

		jTextFieldResuld = new JTextField();
		jTextFieldResuld.setPreferredSize(new Dimension(600, 50));
		jTextFieldResuld.setEditable(false);
		this.add(jTextFieldResuld, BorderLayout.SOUTH);

		this.pack();
		this.setLocationRelativeTo(null);
	}

	public void windowClosing() {
		this.dispose();
	}

	private void init() {
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MainProgram ex21 = new MainProgram();
		ex21.init();
	}

}
