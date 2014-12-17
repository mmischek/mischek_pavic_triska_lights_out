/**
 * 
 */
package teamarbeit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import teamarbeit.MyPanel;

/**
 * Der Controller für das Programm
 * 
 * @author Pavic Antonio / Matthias Mischek
 * @version 10.12.2014/ v.1
 */
public class MyController implements ActionListener {

	private MyPanel p;
	private LightsOutModel m;
	@SuppressWarnings("unused")
	private MyFrame f;

	/**
	 * Standardkonstruktor
	 */
	public MyController() {
		this.p = new MyPanel(this);
		this.m = new LightsOutModel();
		this.f = new MyFrame(p, "Lights Out Game");
		color(m.getLight());

	}

	/**
	 * Action Performed Methode - Was passier bei einer Eingehenden Information
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Restart")) {
			m.init();
			p.setIntmoves(0);
			p.getLmoves().setText("Moves: " + p.getIntmoves());
			color(m.getLight());

		}

		else {
			String es = e.getActionCommand();
			p.setIntmoves(p.getIntmoves() + 1);
			p.getLmoves().setText("Moves: " + p.getIntmoves());
			String tmp[] = es.split(" ");
			int f = Integer.parseInt(tmp[0]) - 1;
			int g = Integer.parseInt(tmp[1]);
			color(m.switched(f, g));
			if (m.win()) {
				JOptionPane.showMessageDialog(p,
						"Herzlichen Glueckwunsch, Sie haben gewonnen!");
				m.init();
				color(m.getLight());
			}
		}

	}

	/**
	 * setzt die Farbe der lichter
	 * 
	 * @param state
	 */
	public void color(boolean[][] state) {

		for (int i = 0; i < p.getButtons().length; i++) {
			for (int j = 0; j < m.getSize(); j++) {
				if (state[i][j] == true) {
					p.getButtons()[i][j].setBackground(new Color(0x808080));
				} else
					p.getButtons()[i][j].setBackground(new Color(0x008080));

			}

		}
	}

	/**
	 * Main Methode zum Starten
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new MyController();
	}

}
