/**
 * 
 */
package teamarbeit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import teamarbeit.MyPanel;

/**
 * Der Controller für das Programm
 * 
 * @author Pavic Antonio
 * @version 10.12.2014/ v.10
 */
public class MyController implements ActionListener{

	private MyPanel p;
	private MyModel m;
	
	
	
	public MyController(MyPanel p){
		this.p = p;
		this.m = m;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i; i < 26; i++){
			if(e.getActionCommand().equals(i)){
				p.isEnable();
			}
		}
		
	}
	
	
	public static void main (String [] args){
		new MyController();
	}
	
	
	
}
