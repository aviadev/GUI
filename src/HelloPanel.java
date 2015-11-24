// HelloPanel.java
// Author: Shay Tavor, shay.tavor@gmail.com
// A simple panel that contains a label and two buttons

import javax.swing.*;

public class HelloPanel extends JPanel
{
	private JLabel lblHello;
	private JButton cmdOK, cmdCancel;
	public HelloPanel()
	{
		lblHello = new JLabel("Hello");
		cmdOK = new JButton("OK");
		cmdCancel = new JButton("Cancel");
		add(lblHello);
		add(cmdOK);
		add(cmdCancel);
	}

}