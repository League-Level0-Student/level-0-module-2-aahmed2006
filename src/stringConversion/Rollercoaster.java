package stringConversion;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("What is your height (in inches)?");
	int h = Integer.parseInt(height);
	if(h<48) {
		JOptionPane.showMessageDialog(null, "You need to grow more to go on the rollercoaster.");
		
	} else if(h>48) {
		JOptionPane.showMessageDialog(null, "You can go on the rollercoaster.");
	}
}
}
