package teamarbeit;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
	
	private MyController c;
	private JButton[] buttons = new JButton[25];
	private JButton restart = new JButton("Restart");
	private int intmoves; 
	private JLabel lmoves = new JLabel ("Moves: " + intmoves);
	
	public MyPanel(MyController c){
	
		this.setLayout(new BorderLayout());
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(5,5,5,5));

		for(int x=0; x<buttons.length; x++){
			buttons[x] = new JButton();
			panel.add(buttons[x]);
			buttons[x].addActionListener(c);
			buttons[x].setBackground(Color.GREEN);
			buttons[x].setOpaque(true);
			buttons[x].addActionListener(c);
			if(!buttons[x].isEnabled()){
				buttons[x].setBackground(Color.YELLOW);
			}
		}
		JPanel twopanel = new JPanel();
		twopanel.setLayout(new GridLayout(1, 2, 10, 10));
		twopanel.add(lmoves);
		twopanel.add(restart);
		restart.addActionListener(c);
		this.add(panel, BorderLayout.CENTER);
		this.add(twopanel, BorderLayout.SOUTH);
	}

	/**
	 * @return the buttons
	 */
	public JButton[] getButtons() {
		return buttons;
	}

	/**
	 * @param buttons the buttons to set
	 */
	public void setButtons(JButton[] buttons) {
		this.buttons = buttons;
	}

	/**
	 * @return the restart
	 */
	public JButton getRestart() {
		return restart;
	}

	/**
	 * @param restart the restart to set
	 */
	public void setRestart(JButton restart) {
		this.restart = restart;
	}

	/**
	 * @return the intmoves
	 */
	public int getIntmoves() {
		return intmoves;
	}

	/**
	 * @param intmoves the intmoves to set
	 */
	public void setIntmoves(int intmoves) {
		this.intmoves = intmoves;
	}

	/**
	 * @return the lmoves
	 */
	public JLabel getLmoves() {
		return lmoves;
	}

	/**
	 * @param lmoves the lmoves to set
	 */
	public void setLmoves(JLabel lmoves) {
		this.lmoves = lmoves;
	}
	
	
	
	
}
