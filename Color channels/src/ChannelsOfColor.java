import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;

public class ChannelsOfColor extends JFrame {
	private int r = 0;
	private int b = 0;
	private int g = 0;

	private MyFrame f;

	JLabel redLabel, greenLabel, blueLabel;
	JSlider redSlider, greenSlider, blueSlider;

	ChannelsOfColor(final MyFrame mf) {
		this.f = mf;
		JFrame frame = new JFrame("Colors");
		frame.setLayout(new GridLayout(2, 0));
		JPanel thePanel = new JPanel();
		thePanel.setLayout(new GridLayout(0, 3));
		frame.add(thePanel);
		frame.setVisible(true);
		frame.setSize(600, 400);

		redSlider = new JSlider(0, 255, 1);
		redSlider.setBorder(new TitledBorder("RED"));
		thePanel.add(redSlider, BorderLayout.NORTH);

		greenSlider = new JSlider(0, 255, 1);
		greenSlider.setBorder(new TitledBorder("GREEN"));
		thePanel.add(greenSlider, BorderLayout.CENTER);

		blueSlider = new JSlider(0, 255, 1);
		blueSlider.setBorder(new TitledBorder("BLUE"));
		thePanel.add(blueSlider, BorderLayout.SOUTH);

		redSlider.addChangeListener(e -> r = redSlider.getValue());
		greenSlider.addChangeListener(e -> g = greenSlider.getValue());
		blueSlider.addChangeListener(e -> b = blueSlider.getValue());

		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(e -> frame.dispose());

		JPanel buttons_panel = new JPanel(new FlowLayout());
		JButton ok = new JButton("OK");
		ok.addActionListener(e -> {
			f.getContentPane().setBackground(new Color(r, g, b));
			frame.dispose();
		});

		buttons_panel.add(ok);
		buttons_panel.add(cancel);
		frame.add(buttons_panel);

	}
}
