import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by Aviad on 24/11/2015.
 */
public class DrawingLines extends JPanel
{

private int x1, y1, x2, y2;
	public DrawingLines ()
	{
		Listener listener = new Listener();
		this.addMouseListener(listener);
		this.addMouseMotionListener(listener);
	}

	public void paintComponent (Graphics g)
	{
		super.paintComponent(g);

		g.drawLine(x1,y1,x2,y2);


	}

	private class Listener extends MouseAdapter implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			x1 = e.getX();
			y1 = e.getY();

		}

		@Override
		public void mouseDragged(MouseEvent e)
		{
			x2 = e.getX();
			y2 = e.getY();
			repaint();
		}
	}
}
