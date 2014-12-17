/**
 * 
 */
package teamarbeit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import teamarbeit.MyPanel;

/**
 * Der Controller f�r das Programm
 * 
 * @author Pavic Antonio
 * @version 10.12.2014/ v.10
 */
public class MyController implements ActionListener{

	private MyPanel p;
	private LightsOutModel m;
	private MyFrame f;
	
	
	
	public MyController(){
		this.p = new MyPanel(this);
		this.m = new LightsOutModel(5);
		this.f = new MyFrame(p, "Lights Out Game");
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 26; i++){
			if(e.getActionCommand().equals(i)){
				//p.isEnable();
			}
		}
		
	}
	
	
	public static void main (String [] args){
		new MyController();
	}
	
	
	
}
