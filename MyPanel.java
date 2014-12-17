package Triska;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton[] buttons = new JButton[24];
	
	public MyPanel(MyController mc){
		
		this.setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(5,5,5,5));
		int random = (int) (Math.random()*25);
		buttons[random].setEnabled(false);
		for(int x=0; x<buttons.length; x++){
			panel.add(buttons[x]);
			buttons[x].addActionListener(mc);
			buttons[x].setBackground(Color.GREEN);
			buttons[x].setActionCommand(mc);
			if(!buttons[x].isEnabled()){
				buttons[x].setBackground(Color.YELLOW);
			}
		}
		this.add(panel, BorderLayout.CENTER);
	}
	
}
