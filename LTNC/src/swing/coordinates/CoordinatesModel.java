package swing.coordinates;

public class CoordinatesModel {
	private int countClick = 0;
	private boolean enter = false;
	private int x = 0;
	private int y = 0;

	public void click() {
		countClick++;
	}

	public int getCountClick() {
		return countClick;
	}

	public void enter() {
		this.enter = true;
	}

	public void exit() {
		this.enter = false;
	}

	public boolean getEnter() {
		return this.enter;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
