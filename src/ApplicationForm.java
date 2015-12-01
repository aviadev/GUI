import javax.swing.*;
import java.awt.*;

import java.awt.ActiveEvent;
//import .awt.ActiveEvent;

/**
 * Created by Aviad on 24/11/2015.
 */
public class ApplicationForm extends JPanel
{
private JLabel lblTitile, lblFirst, lblLast, lblAge, lblid;
private JTextField txtFirst, txtLast, txtAge, txtId;
private JButton cmdOK, cmdCancel;

public ApplicationForm ()
{
	lblTitile = new JLabel("Personal Details");
	lblFirst = new JLabel("First");
	lblLast = new JLabel("Last");
	lblAge = new JLabel("Age");
	lblid = new JLabel("ID");
	txtFirst = new JTextField(10);
	txtLast = new JTextField(10);
	txtAge = new JTextField(10);
	txtId = new JTextField(10);
	cmdOK = new JButton("OK");
	cmdCancel = new JButton("Cancel");

	JPanel top = new JPanel();
	top.add(lblTitile);

	JPanel bottom = new JPanel();
	bottom.add(cmdOK);
	bottom.add(cmdCancel);

	JPanel center = new JPanel();

	center.setLayout(new GridLayout(2,4,10,10));
	center.add(lblFirst);
	center.add(txtFirst);
	center.add(lblLast);
	center.add(txtLast);
	center.add(lblAge);
	center.add(txtAge);
	center.add(lblid);
	center.add(txtId);


	//SetLayout(new BorderLayout(10, 10));
	add(top);
	add(center);
	add(bottom);


}
}
