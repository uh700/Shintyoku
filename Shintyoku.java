import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class main extends JFrame{
	//GUI部品の変数宣言
	private JFrame mainFrame;
	private Container contentPane;
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
		mainFrame.setSize(280,350);
		mainFrame.setLocationRelativeTo(null);
		contentPane = mainFrame.getContentPane();
		
		numberField = new JTextField();
		
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
        //ボタン座標の固定
        Button1.setBounds(10,100,80,30);
        Button2.setBounds(90,100,80,30);
        Button3.setBounds(170,100,80,30);
        Button4.setBounds(10,150,80,30);
        Button5.setBounds(90,150,80,30);
        Button6.setBounds(170,150,80,30);
        Button7.setBounds(10,200,80,30);
        Button8.setBounds(90,200,80,30);
        Button9.setBounds(170,200,80,30);
        Button0.setBounds(90,250,80,30);
        ButtonClear.setBounds(170,250,80,30);
        ButtonStart.setBounds(10,250,80,30);
        //ボタンの設置
        contentPane.add(Button0);
        contentPane.add(Button1);
        contentPane.add(Button2);
        contentPane.add(Button3);
        contentPane.add(Button4);
        contentPane.add(Button5);
        contentPane.add(Button6);
        contentPane.add(Button7);
        contentPane.add(Button8);
        contentPane.add(Button9);
        contentPane.add(ButtonStart);
        contentPane.add(ButtonClear);
        //テキストフィールドの座標固定
        contentPane.add(numberField, BorderLayout.NORTH);
        mainFrame.setVisible(true);
	}
	
	public static void main(String args[]){
		new main();
	}
}
