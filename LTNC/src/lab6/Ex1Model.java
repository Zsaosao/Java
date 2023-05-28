package lab6;

public class Ex1Model {
	String operator;
	double firstNumber, secondNumber;

	public Ex1Model() {
		this.firstNumber = this.secondNumber = 0;
		this.operator = "";
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public String getOperator() {
		return operator;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String equals() {
		double result;
		if (operator.equals("")) {
			return "please select the sign";
		} else if (operator.equals("+")) {
			result = this.firstNumber + this.secondNumber;
		} else if (operator.equals("-")) {
			result = this.firstNumber - this.secondNumber;
		} else if (operator.equals("*")) {
			result = this.firstNumber * this.secondNumber;
		} else {
			result = this.firstNumber / this.secondNumber;
		}
		return result + "";
	}
}
