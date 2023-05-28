package lab6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex1Controll implements ActionListener {
	private Ex1 view;

	public Ex1Controll(Ex1 view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("=")) {
			this.view.onClickEqual();
		} else {
			this.view.onClickOperation(str);
		}
	}

}
