
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		JFrame frame = new JFrame("Colors");
		frame.getContentPane().setBackground(color);
		frame.setSize(WIDTH, HEIGHT);
		System.out.println("red, green, blue " + red + green + blue);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		JMenuItem colorChannels = new JMenuItem("Color channels");
		menu.add(colorChannels);
		colorChannels.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new ChannelsOfColor(MyFrame.this);

			}
		});
		menu.addSeparator();
		JMenuItem exit = new JMenuItem("Exit");
		menu.add(exit);

		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		frame.setVisible(true);

		// vycentruje mi okno
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xPos = (dim.width / 2) - (frame.getWidth() / 2);
		int yPos = (dim.height / 2) - (frame.getHeight() / 2);
		frame.setLocation(xPos, yPos);
	}
}
