package firstprj;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class mywindow extends JFrame{ 
	public mywindow() {
		JButton b1 = new JButton("OK");
		JTextField t1 = new JTextField();
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridLayout g = new GridLayout(3,3);
		setLayout(g);
		add(b1,0,0);
		add(t1,0,1);
	}
}

public class swingdemo1 {
	public static void main(String[] args) {
		mywindow win = new mywindow();
	}

}
