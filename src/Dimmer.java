import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Aviad on 24/11/2015.
 */
public class Dimmer extends JPanel
{
	private JButton cmdDim, cmdLight;
	private int alpha;
	private int alphaInterval = 5;
private Timer timer;

	public Dimmer ()
	{
		alpha = 0;
		cmdDim = new JButton("Dim");
		cmdLight = new JButton("Light");

		setBackground(Color.WHITE);
		Listener lis = new Listener();
		timer = new Timer(60, lis);
		cmdDim.addActionListener(lis);
		cmdLight.addActionListener(lis);
		add(cmdDim);
		add(cmdLight);
	}

public void paintComponent (Graphics g)
{
	super.paintComponent(g);
	Color c = new Color(0,0,0, alpha);
	g.setColor(c);
	g.fillRect(0,0,getWidth(), getHeight());
}

private class Listener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == timer)
		{
			alpha += alphaInterval;
			if (alpha >= 255 || alpha <= 0)
				timer.stop();
			else
				repaint();;
		}

		else if (e.getSource() == cmdDim)
		{
			alphaInterval = 5;

				timer.start();
		}

		else if (e.getSource() == cmdLight)
		{
			alphaInterval = -5;

			timer.start();
		}

	}
}
}
