package swing.coordinates;

import java.awt.*;
import javax.swing.*;

public class CoordinatesView extends JFrame {
	private CoordinatesModel model = new CoordinatesModel();
	private JLabel mouseClicked;
	private JLabel mouseEntered;
	private JLabel coordintes;

	public CoordinatesView() {

		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		CoordinatesControll model = new CoordinatesControll(this);

		JPanel cusor = new JPanel();
		cusor.addMouseListener(model);
		cusor.addMouseMotionListener(model);
		cusor.setBackground(Color.red);
		this.add(cusor, BorderLayout.CENTER);

		JPanel jPanelInfor = new JPanel(new GridLayout(1, 3));
		mouseClicked = new JLabel("Mouse Clicked: 0");
		jPanelInfor.add(mouseClicked);

		mouseEntered = new JLabel("Mouse Entered: no");
		jPanelInfor.add(mouseEntered);

		coordintes = new JLabel("coordinates x:0 y:0");
		jPanelInfor.add(coordintes);

		this.add(jPanelInfor, BorderLayout.SOUTH);

		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void click() {
		this.model.click();
		mouseClicked.setText(this.model.getCountClick() + "");
	}

	public void enter() {
		this.model.enter();
		mouseEntered.setText("" + this.model.getEnter());
		this.coordintes.setText("coordinates x: " + this.model.getX() + " y: " + this.model.getX());
	}

	public void move() {
		this.coordintes.setText("coordinates x: " + this.model.getX() + " y: " + this.model.getX());
	}

	public void exit() {
		this.model.exit();
		mouseEntered.setText("" + this.model.getEnter());
		this.coordintes.setText("coordinates x: 0 y: 0");
	}

	public void setX(int x) {
		this.model.setX(x);

	}

	public void setY(int y) {
		this.model.setY(y);
	}

	private void init() {
	}

	public static void main(String[] args) {
		CoordinatesView view = new CoordinatesView();
		view.init();
	}

}
