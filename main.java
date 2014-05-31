import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

	public class main extends JFrame implements ActionListener{
	
	/*
	 * 宣言
	 */
	private JFrame mainFrame;
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
		mainFrame.setSize(300,400);
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
        
      //ボタンのアクションリスナーとの関連づけ
        Button1.addActionListener(this);
        Button2.addActionListener(this);
        Button3.addActionListener(this);
        Button4.addActionListener(this);
        Button5.addActionListener(this);
        Button6.addActionListener(this);
        Button7.addActionListener(this);
        Button8.addActionListener(this);
        Button9.addActionListener(this);
        Button0.addActionListener(this);
        ButtonClear.addActionListener(this);
        ButtonStart.addActionListener(this);
        
        //テキストフィールドの追加
        numberField = new JTextField(7);
        numberField.setPreferredSize(new Dimension(300,100));

        //フォントの指定
        numberField.setFont(new Font("MSゴシック",Font.BOLD,45));
        
        //Panel1を生成
        Panel1 = new JPanel();
        Panel1.setPreferredSize(new Dimension(300,300));
        GridLayout grid1 = new GridLayout(4,3);
        
        //Panel1をGridLayout
        Panel1.setLayout(grid1);
        
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
        mainFrame.add(Panel1);
        
        //Panel2を生成
        Panel2 = new JPanel();
        Panel2.setPreferredSize(new Dimension(300,100));
        
        //Panel2にTextFieldを設置
        Panel2.add(numberField);
        
        //Panel2をContantPaneに設置
        mainFrame.add(Panel2,BorderLayout.NORTH);
        
        mainFrame.setVisible(true);
	}
	
	/*
	 * 利用者の操作に応じた処理の実装
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == Button1){
			numberField.setText("1");
		}else if(event.getSource() == Button2){
			numberField.setText("2");
		}
	}
	
	/*
	 * mainメソッド
	 */
	public static void main(String args[]){
		new main();
	}
}