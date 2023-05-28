package learn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Learn extends JFrame implements MouseListener, ActionListener {
	private int count;

	public Learn() {
		this.addMouseListener(this);
		this.count = 0;
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(4, 5));
		Learn _this = this;
		for (int i = 0; i < 20; i++) {
			JButton jButton = new JButton("" + i);
			jButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// String str = e.getActionCommand();
					_this.plus();
				}

			});
			this.add(jButton);
		}

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void init() {
	}

	public void plus() {
		this.count++;
		System.out.println(this.count);
	}

	public static void main(String[] args) {
		Learn l = new Learn();
		l.init();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("click");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
