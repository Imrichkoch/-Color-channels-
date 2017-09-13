
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private int red = 0;

	public MyFrame mf;

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	private int blue = 0;
	private int green = 0;

	public MyFrame() {

		Color color = new Color(red, green, blue);

		getContentPane().setBackground(color);
		setSize(WIDTH, HEIGHT);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");

		JMenuItem colorChannels = new JMenuItem("Color channels");
		menu.add(colorChannels);
		colorChannels.addActionListener(e -> new ChannelsOfColor(MyFrame.this));

		menu.addSeparator();

		JMenuItem exit = new JMenuItem("Exit");
		menu.add(exit);
		exit.addActionListener(e -> System.exit(0));

		menuBar.add(menu);
		setJMenuBar(menuBar);

		setVisible(true);

	}
}
