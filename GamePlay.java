package firstprj;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class tictactoe extends JFrame implements ActionListener{
	JButton [] jb = new JButton[9]; 
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	char mark='X';
	JLabel l = new JLabel();
	public tictactoe() {
		setLayout(gb);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		
		int j=0;
		for(int i=0;i<9;i++) {
			jb[i] = new JButton("");
			if(i==3||i==6)j++;
			gbc.gridx = j; gbc.gridy = i%3;
			jb[i].setPreferredSize(new Dimension(100,100));
			add(jb[i],gbc);
			jb[i].addActionListener(this);
			jb[i].setFont(jb[i].getFont().deriveFont(40f));
		}
		l.setPreferredSize(new Dimension(400,100));
		l.setText("Welcome");
		gbc.gridwidth=4;
		l.setFont(l.getFont().deriveFont(40f));
		gbc.gridx = 0; gbc.gridy = 4;
		add(l,gbc);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<9;i++) {
			if(e.getSource()==jb[i]) {
				jb[i].setText(""+mark);
				if(mark=='X')
					mark = 'O';
				else
					mark='X';
				jb[i].setEnabled(false);
			}
		}
		winLogic(0,1,2);
		winLogic(3,4,5);
		winLogic(6,7,8);
		winLogic(0,3,6);
		winLogic(1,4,7);
		winLogic(2,5,8);
		winLogic(0,4,8);
		winLogic(2,4,6);
	}
	void winLogic(int w, int x, int y) {
		if((jb[w].getText().equals(jb[x].getText()))&&(jb[w].getText().equals(jb[y].getText()))&&(jb[w].getText().equals("X"))) {
			l.setText("X Wins..");
		}
		if((jb[w].getText().equals(jb[x].getText()))&&(jb[w].getText().equals(jb[y].getText()))&&(jb[w].getText().equals("O"))) {
			l.setText("O Wins..");
		}
	}
	
}

public class GamePlay {
	public static void main(String[] args) {
		tictactoe t = new tictactoe();
	}
}
