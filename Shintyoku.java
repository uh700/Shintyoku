import javax.swing.*;
import java.awt.BorderLayout;
public class AddFrame extends JFrame{
	public static void main(String args[]){
		AddFrame mainFrame = new AddFrame();
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setBounds(10,10,300,420);
		mainFrame.setTitle("ﾊﾟｮｮ");
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
	}
	
	AddFrame(){
		JPanel Panel = new JPanel();
		Panel.setLayout(null);
		
		JButton button0 = new JButton("0");
		button0.setBounds(10,100,80,30);
		
		JButton button1 = new JButton("1");
		button1.setBounds(90,100,80,30);
		
		Panel.add(button0);
		Panel.add(button1);
		
		getContentPane().add(Panel,BorderLayout.CENTER);
	}
}
