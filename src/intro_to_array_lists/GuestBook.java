package intro_to_array_lists;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements MouseListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public static void main(String[] args) {
		GuestBook guest = new GuestBook();
		guest.frame();

	}

	public void frame() {
		frame.add(panel);
		panel.add(add);
		add.setText("Add Names");
		panel.add(view);
		view.setText("View Names");
		frame.setVisible(true);
		view.addMouseListener(this);
		add.addMouseListener(this);
		frame.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(add)) {
			String t = JOptionPane.showInputDialog("Enter a name.");

			names.add(t);
		} else if (e.getSource().equals(view)) {
			String allNames = " ";
			int y = 1;
			for (int i = 0; i < names.size(); i++) {
				allNames = allNames + "Guest #" + y++ + ": " + names.get(i) + "\n";
				// i + allNames + "\n" + names.get(i);
			}
			JOptionPane.showMessageDialog(null, allNames);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
