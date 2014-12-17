package Triska;
import javax.swing.JFrame;

/**
 * Frame Klasse.
 * @author FlorianTriska
 * @version 1.0
 */
public class MyFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	/**
	 * Frame Konstruktor, hier werden Eigenschaften des Frame's festgelegt.
	 * 
	 */
	public MyFrame(MyPanel pn, String x){
		super(x);
		this.add(pn);
		this.setSize(600,600);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	//public static void main(String[]args){
	//	MyPanel pn = new MyPanel(new MyController());
	//	new MyFrame(MyPanel pn, String x);
	//}
}