/*
 * Tester.java
 *
 *
 * Tester for GUI applications
 * Written by Shay Tavor, shay.tavor@gmail.com
 */

/**
 *
 * @author Shay Tavor 
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Tester {
    
    public static void main(String[] args)
    {
       JFrame frame = new JFrame("Testing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        // createing the customized panels:
	//HelloPanel p = new HelloPanel();		// Simple label and buttons
       //  CounterPanel p = new CounterPanel();        	// counts button's presses'
       // DrawingPoints p = new DrawingPoints(10);      // draws point in each mouse click
       // Cross p = new Cross();
       // LayoutPanel p = new LayoutPanel();       

       // BankPanel p = new BankPanel();                      // the Bank GUI
        //DrawingLines p = new DrawingLines();
       ApplicationForm p = new ApplicationForm();
       // Dimmer p = new Dimmer();
        frame.add(p);
        frame.setVisible(true);
       // Generics generics = new Generics();
	//dialogBoxes();
    }
    public static void dialogBoxes()
    {
	//JOptionPane.showMessageDialog(null, "Hello Everybody");		// a simple dialog
	//JOptionPane.showMessageDialog(null, "Hello Everybody", "A Message", JOptionPane.ERROR_MESSAGE);		// a simple dialog with icon
	//String name;
	//name = JOptionPane.showInputDialog(null, "Enter your name:");		// an input dialog
	int i = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete", JOptionPane.YES_NO_OPTION);	// a confirm dialog
	
    }
    
}
