import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		Gameplay gamePlay = new Gameplay();
		f.setBounds(10, 10, 700, 600);
		f.setTitle("BrickBreakGame");
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(gamePlay);
		
		
	}

}
