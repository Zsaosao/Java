package lab6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex6 extends JFrame {
	JLabel jPanelPicture;

	public Ex6() {
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// menu
		JMenuBar jMenuBarBug = new JMenuBar();

		JMenu jMenuBug = new JMenu("List of bug");
		jMenuBug.setPreferredSize(new Dimension(600, 30));
		for (int i = 0; i < 3; i++) {
			ImageIcon imgBug = new ImageIcon("src\\asset\\picture\\bug" + i + ".jpg");
			JMenuItem jMenuItemBug = new JMenuItem(subStringFile(imgBug.getDescription()));
			int _i = i;
			jMenuItemBug.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					ImageIcon imgBugAction = new ImageIcon("src\\asset\\picture\\bug" + (_i - 1) + ".jpg");
					imgBugAction.setImage(imgBug.getImage().getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH));
					jPanelPicture.setIcon(imgBugAction);
				}
			});
			jMenuBug.add(jMenuItemBug);
		}

		jMenuBarBug.add(jMenuBug);
		this.add(jMenuBarBug, BorderLayout.NORTH);

		// picture
		JPanel jPanelCenter = new JPanel();
		jPanelPicture = new JLabel();

		ImageIcon imgBug = new ImageIcon("src\\asset\\picture\\bug0.jpg");
		imgBug.setImage(imgBug.getImage().getScaledInstance(300, 200, java.awt.Image.SCALE_SMOOTH));
		jPanelPicture.setIcon(imgBug);

		jPanelCenter.add(jPanelPicture);
		this.add(jPanelCenter, BorderLayout.CENTER);

		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
	}

	private void init() {
		this.setVisible(true);
	}

	private String subStringFile(String fileName) {
		int index = fileName.lastIndexOf("\\");
		String fileResult = fileName.substring(index + 1);
		return fileResult;
	}

	public static void main(String[] args) {
		Ex6 ex6 = new Ex6();
		ex6.init();
	}
}
