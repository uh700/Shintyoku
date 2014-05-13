import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class main implements ActionListener{
	//GUI部品の変数宣言
	private JFrame mainFrame;
	private Container contentPane;
	private JPanel mainPanel;
	private JTextField numberField;
	private JButton Button0;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JButton Button6;
	private JButton Button7;
	private JButton Button8;
	private JButton Button9;
	private JButton ButtonClear;
	private JButton ButtonStart;
	//GUI挙動インスタンス
	public main(){
		mainFrame = new JFrame("計算ゲーム");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(420,300);
		mainFrame.setLocationRelativeTo(null);
		contentPane = mainFrame.getContentPane();
		
		mainPanel = new JPanel();
		numberField = new JTextField();
	}
}
