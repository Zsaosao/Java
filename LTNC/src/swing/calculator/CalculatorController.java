package swing.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
	private CalculatorView view;

	public CalculatorController(CalculatorView view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("+")) {
			this.view.operatorPlus();
		} else if (str.equals("-")) {
			this.view.operatorMinus();
		} else if (str.equals("*")) {
			this.view.operatorMultiply();
		} else if (str.equals("/")) {
			this.view.operatorDivision();
		} else if (str.equals("=")) {
			this.view.operatorEqual();
		} else {
			this.view.whenUserClicked(Integer.parseInt(str));
		}

	}

}
