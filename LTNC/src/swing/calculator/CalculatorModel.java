package swing.calculator;

public class CalculatorModel {
	private int firstNumer;
	private int secondNumer;
	private boolean flag;
	private String operator;

	public CalculatorModel() {
		flag = true;
		this.firstNumer = this.secondNumer = 0;
	}

	public void whenUserClick(int number) {
		if (this.flag) {
			this.firstNumer = this.firstNumer * 10 + number;
		} else {
			this.secondNumer = this.secondNumer * 10 + number;
		}
	}

	public void operatorPlus() {
		this.flag = false;
		this.operator = "+";
		this.secondNumer = 0;
	}

	public void operatorMinus() {
		this.flag = false;
		this.operator = "-";
		this.secondNumer = 0;
	}

	public void operatorMultiply() {
		this.flag = false;
		this.operator = "*";
		this.secondNumer = 0;
	}

	public void operatorDivision() {
		this.flag = false;
		this.operator = "/";
		this.secondNumer = 0;
	}

	public void operatorEqual() {
		if (!flag) {
			this.flag = true;
		}
		if (this.operator.equals("+")) {
			this.firstNumer += this.secondNumer;
			this.flag = true;
		} else if (this.operator.equals("-")) {
			this.firstNumer -= this.secondNumer;
			this.flag = true;

		} else if (this.operator.equals("*")) {
			this.firstNumer *= this.secondNumer;
			this.flag = true;

		} else {
			this.firstNumer /= this.secondNumer;
			this.flag = true;

		}
	}

	public int getNumer() {
		if (flag) {
			return this.firstNumer;
		}
		return this.secondNumer;
	}

}
