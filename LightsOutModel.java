package teamarbeit;

/**
 * Model Klasse, Ereignissteuerung
 * 
 * @author Matthias Mischek
 * @version 1.0
 *
 */
public class LightsOutModel {

	private int size;
	private boolean[][] light;

	/**
	 * Standardkonstruktor
	 */
	public LightsOutModel() {
		this.size = 5;
		init();
	}

	/**
	 * Initialisiert die Button
	 * 
	 */
	public void init() {
		light = new boolean[size][size];
		for (int i = 0; i < light.length; i++) {
			for (int j = 0; j < light[i].length; j++) {
				light[i][j] = false;
			}
		}
		while (win()) {
			for (int i = 0; i < 50; i++) {
				int f = (int) (Math.random() * size);
				int g = (int) (Math.random() * size);
				switched(f, g);
			}
		}
	}

	/**
	 * aendert die umliegenden Button + den Button selbst
	 * 
	 * @param f
	 * @param g
	 * @return
	 */
	public boolean[][] switched(int f, int g) {
		light[f][g] = !light[f][g];

		if (f != 0) {
			light[f][g] = !light[f - 1][g];
		}
		if (f != light.length - 1) {
			light[f + 1][g] = !light[f + 1][g];
		}
		if (g != 0) {
			light[f][g - 1] = !light[f][g - 1];
		}
		if (g != light.length - 1) {
			light[f][g + 1] = !light[f][g + 1];
		}
		return light;
	}

	/**
	 * ueberpueft ob man gewonnen hat
	 * 
	 * @return gewonnen true/false
	 */
	public boolean win() {
		boolean win = true;
		for (int i = 0; i < light.length; i++) {
			for (int j = 0; j < light[i].length; j++) {
				if (light[i][j]) {
					win = false;
				}
			}
		}
		return win;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the light
	 */
	public boolean[][] getLight() {
		return light;
	}

	/**
	 * @param light
	 *            the light to set
	 */
	public void setLight(boolean[][] light) {
		this.light = light;
	}

}
