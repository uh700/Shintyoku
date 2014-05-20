import javax.swing.*;
import java.awt.*;
public class TestGridLayout extends JFrame {
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JFrame mainFrame;
	private JPanel mainPanel;
	
	public TestGridLayout(){
		mainFrame = new JFrame("test");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300,300);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setVisible(true);
		
		mainPanel = new JPanel();
		GridLayout grid = new GridLayout(2,2);
		mainPanel.setLayout(grid);
		
		Button1 = new JButton("1");
		Button2 = new JButton("2");
		Button3 = new JButton("3");
		Button4 = new JButton("4");
		
		mainPanel.add(Button1);
		mainPanel.add(Button2);
		mainPanel.add(Button3);
		mainPanel.add(Button4);
		
		mainFrame.add(mainPanel);
	}

	public static void main(String args[]){
		new TestGridLayout();
	}
}
