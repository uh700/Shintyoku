import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class main extends JFrame{
	
	/*
	 * 宣言
	 */
	private JFrame mainFrame;
	private Container contentPane;
	private JTextField numberField;
	private JPanel Panel1;
	private JPanel Panel2;
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
	
	/*
	 * コンストラクタ
	 */
	public main(){
		
		//mainFrameの設定
		mainFrame = new JFrame("計算ゲーム");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(280,350);
		mainFrame.setLocationRelativeTo(null);
		
		//外観をWindows風に設定
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//ボタンの追加
	Button1 = new JButton("1");
        Button2 = new JButton("2");
        Button3 = new JButton("3");
        Button4 = new JButton("4");
        Button5 = new JButton("5");
        Button6 = new JButton("6");
        Button7 = new JButton("7");
        Button8 = new JButton("8");
        Button9 = new JButton("9");
        Button0 = new JButton("0");
        ButtonClear = new JButton("C");
        ButtonStart = new JButton("S");
        
        //Panel1を生成
        Panel1 = new JPanel(new GridLayout(1,1));
        Panel1.setBounds(0,0,270,300);
        
        //Panel1にButtonを設置
        Panel1.add(Button1);
        Panel1.add(Button2);
        Panel1.add(Button3);
        Panel1.add(Button4);
        Panel1.add(Button5);
        Panel1.add(Button6);
        Panel1.add(Button7);
        Panel1.add(Button8);
        Panel1.add(Button9);
        Panel1.add(Button0);
        Panel1.add(ButtonClear);
        Panel1.add(ButtonStart);
        
        //Panel1をContantPaneに設置
        contentPane.add(Panel1);
        
        //テキストフィールドの座標固定
        contentPane.add(numberField, BorderLayout.NORTH);
        mainFrame.setVisible(true);
	}
	
	/*
	 * mainメソッド
	 */
	public static void main(String args[]){
		new main();
	}
}
