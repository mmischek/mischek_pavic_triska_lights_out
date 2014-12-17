package teamarbeit;

import java.awt.*;

import javax.swing.*;

public class MyPanel extends JPanel {
	
	private MyController c;
	private JButton[] buttons = new JButton[25];;
	
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
		
		this.add(panel, BorderLayout.CENTER);
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
	
	
	
}
