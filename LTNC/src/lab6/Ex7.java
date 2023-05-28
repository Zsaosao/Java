package lab6;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex7 extends JFrame {
	JPanel jPanelMenu;

	public Ex7() {
		this.setLayout(new GridLayout(1, 1));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jPanelMenu = new JPanel(new FlowLayout());
		jPanelMenu.setPreferredSize(new Dimension(600, 300));

		JMenuBar jMenuBarBgColor = new JMenuBar();

		JMenu jMenuBgColor = new JMenu("Background Color");

		String[] backgroundColor = { "Black", "Blue", "Cyan", "Dark Gray", "Green", "Light Gray", "Magenta", "Orange",
				"Pink", "Red", "White", "Yellow" };
		for (int i = 0; i < backgroundColor.length; i++) {
			JMenuItem jMenuItemBgColor = new JMenuItem(backgroundColor[i]);
			int _i = i;
			jMenuItemBgColor.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					setBackground(backgroundColor[_i]);
				}

			});
			jMenuBgColor.add(jMenuItemBgColor);
		}
		jMenuBarBgColor.add(jMenuBgColor);
		jPanelMenu.add(jMenuBarBgColor);
		this.add(jPanelMenu);
		this.setBackground(Color.RED);

		this.pack();
	}

	private void init() {
		this.setVisible(true);
	}

	private void setBackground(String color) {
		switch (color.toLowerCase()) {
			case "black":
				this.jPanelMenu.setBackground(Color.BLACK);
				break;
			case "blue":
				this.jPanelMenu.setBackground(Color.GREEN);
				break;
			case "cyan":
				this.jPanelMenu.setBackground(Color.CYAN);
				break;
			case "dark gray":
				this.jPanelMenu.setBackground(Color.DARK_GRAY);
				break;
			case "green":
				this.jPanelMenu.setBackground(Color.GREEN);
				break;
			case "light gray":
				this.jPanelMenu.setBackground(Color.LIGHT_GRAY);
				break;
			case "magenta":
				this.jPanelMenu.setBackground(Color.MAGENTA);
				break;
			case "orange":
				this.jPanelMenu.setBackground(Color.ORANGE);
				break;
			case "pink":
				this.jPanelMenu.setBackground(Color.PINK);
				break;
			case "red":
				this.jPanelMenu.setBackground(Color.RED);
				break;
			case "yellow":
				this.jPanelMenu.setBackground(Color.YELLOW);
				break;
			default:
				this.jPanelMenu.setBackground(Color.WHITE);
				break;
		}
	}

	public static void main(String[] args) {
		Ex7 ex7 = new Ex7();
		ex7.init();
	}
}
