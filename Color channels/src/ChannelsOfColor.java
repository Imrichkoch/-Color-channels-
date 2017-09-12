import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

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
		redSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				r = redSlider.getValue();

			}

		});

		greenSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				g = greenSlider.getValue();

			}

		});

		blueSlider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {

				b = blueSlider.getValue();

			}

		});

		JPanel buttons_panel = new JPanel(new FlowLayout());
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setRed(r);
				f.setGreen(g);
				f.setBlue(b);

				f.getContentPane().setBackground(new Color(r, g, b));
				frame.dispose();

			}
		});

		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});

		buttons_panel.add(ok);
		buttons_panel.add(cancel);
		frame.add(buttons_panel);

	}
}
