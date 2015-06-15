import javax.swing.JFrame;

public class Application {

	public static void main(String[] args) {
		
		//Initialize new frame
		JFrame frame = new JFrame("Hello World");		
		//Close the server on window close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Setting window size 
		frame.setSize(600, 500);				
		//Making frame visible 
		frame.setVisible(true);
	}
}
