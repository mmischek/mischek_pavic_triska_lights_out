package teamarbeit;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * 
 * @author Matthias Mischek
 * @version 1.0
 *
 */
public class LightsOutModel {

private int size;
private boolean light[];


public LightsOutModel(int size) {
	this.size = size;
}




public void init() {
	light = new boolean[size];
	for (int i = 0; i < light.length; i++){
		light[i] = true;
	}
	int maxSize = (int) (Math.random() * (size - 1) + 1);
	int field;
	for (int i = 0; i < maxSize; i++) {
		field = (int) (Math.random() * maxSize + 1);
		light[field] = false;
	}
	
}

private boolean win() {
	for (boolean tmp : light) {
		if (tmp)
			return false;
	}

	return true;
}






}
