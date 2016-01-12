import javax.swing.*;

/**
 * Created by Aviad on 12/01/2016.
 */
public class CounterThread extends Thread
{
private JButton button;

public CounterThread (JButton b)
{
	button = b;
}

public void run ()
{
	int count = (int) (Math.random() * 50) + 10;
	int num = Integer.parseInt(button.getText());

	for (int i = 0; i <= count; i++)
	{
		num = (num + 1) % 10;
		button.setText(num + "");
		try
		{
			Thread.sleep(100);
		}
		catch (InterruptedException e) {};
	}
}
}
