import javax.swing.JButton;
import javax.swing.JFrame;

public class gamescreen extends JFrame {
	public gamescreen() {
		JFrame gamescreen=new JFrame("���л� Ű���");
		gamescreen.setSize(800,680);
		gamescreen.setLocationRelativeTo(null);
		gamescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
		gamescreen.setVisible(true);
		JButton startbtn = new JButton("���� ����");
		JButton endbtn = new JButton("���� ����");
		startbtn.setBounds(150, 300, 200, 50);
		endbtn.setBounds(450, 300, 200, 50);
		gamescreen.add(startbtn);
		gamescreen.add(endbtn);
		
	}	
}

