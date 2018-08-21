package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.JStuff();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList<String> names = new ArrayList<String>();
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	void JStuff() {
		f.setVisible(true);
		f.add(p);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		b1.setText("Add Name");
		b2.setText("View Names");
		b3.setText("Remove Names");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f.pack();
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			 names.add(JOptionPane.showInputDialog("Enter Name"));
		}
		else if(e.getSource() == b2) {
			String result = "";
			for (int i = 0; i < names.size(); i++) {
				result += "Guest #" + (i+1) + ": " + names.get(i) + "\n";
				
			}
			JOptionPane.showMessageDialog(f, result);
		}
		else {
			if(names.size() != 0) {
				names.remove(0);
			}
		}
	}
}
