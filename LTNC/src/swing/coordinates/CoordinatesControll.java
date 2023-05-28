package swing.coordinates;

import java.awt.event.*;

public class CoordinatesControll implements MouseListener, MouseMotionListener {

	private CoordinatesView view;

	public CoordinatesControll(CoordinatesView view) {
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		this.view.click();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.view.click();
	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.view.enter();
		this.view.setX(x);
		this.view.setY(y);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.view.exit();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// int x = e.getX();
		// int y = e.getY();
		// this.view.setX(x);
		// this.view.setY(y);
		// this.view.move();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		this.view.setX(x);
		this.view.setY(y);
		this.view.move();
	}

}
