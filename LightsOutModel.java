package teamarbeit;


/**
 * Model Klasse, Ereignissteuerung
 * @author Matthias Mischek
 * @version 1.0
 *
 */
public class LightsOutModel {

	private int size;
	private boolean light[][];

	public LightsOutModel(int size) {
		this.size = size;
		this.light = light;
	}

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

	public boolean[][] switched(int f, int g) {
		light[f][g] = !light[f][g];

		if (f != 0) {
			light[f][g - 1] = !light[f][g - 1];
		}
		if (f != size - 1) {
			light[f][g + 1] = !light[f][g + 1];
		}
		if (g != 0) {
			light[f - 1][g] = !light[f - 1][g];
		}
		if (g != size - 1) {
			light[f + 1][g] = !light[f + 1][g];
		}
		return light;
	}

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
