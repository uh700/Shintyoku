import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public abstract class CalcAdd implements ActionListener{
	private JFrame mainFrame;
	private JPanel Panel;
	private JTextArea textArea;
	private JTextField field;
	private Container contentPane;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button0;
	private JButton buttonClear;
	private JButton buttonStart;
	
	public CalcAdd(){
		mainFrame = new JFrame("計算ゲーム");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300,420);
		mainFrame.setLocationRelativeTo(null);
		contentPane = mainFrame.getContentPane();
		field = new JTextField();
        textArea = new JTextArea();
        //ボタンの追加
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        button0 = new JButton("0");
        buttonClear = new JButton("C");
        buttonStart = new JButton("S");
        //アクションリスナーとの関連付け//
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonStart.addActionListener(this);
        //ボタンの設置
        Panel = new JPanel();
        Panel.add(button1);
        Panel.add(button2);
        Panel.add(button3);
        Panel.add(button4);
        Panel.add(button5);
        Panel.add(button6);
        Panel.add(button7);
        Panel.add(button8);
        Panel.add(button9);
        Panel.add(button0);
        Panel.add(buttonClear);
        Panel.add(buttonStart);
        //ボタン座標の固定
        button1.setBounds(10,100,80,30);
        button2.setBounds(90,100,80,30);
        button3.setBounds(170,100,80,30);
        button4.setBounds(10,150,80,30);
        button5.setBounds(90,150,80,30);
        button6.setBounds(170,150,80,30);
        button7.setBounds(10,200,80,30);
        button8.setBounds(90,200,80,30);
        button9.setBounds(170,200,80,30);
        button0.setBounds(90,250,80,30);
        buttonClear.setBounds(170,250,80,30);
        buttonStart.setBounds(10,250,80,30);
        //表示
        mainFrame.setVisible(true);
	}
	
	//イベント
	public void actionPerfome(ActionEvent event){
		//操作対象の判断
		if(event.getSource() == button1){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button2){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button3){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button4){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button5){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button6){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button7){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button8){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button9){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == button0){
			//テキストエリアへの文字列の追加
			textArea.append(field.getText());
		}
		if(event.getSource() == buttonClear){
			//テキストエリアへの文字列の消去
			field.setText(null);
		}
		if(event.getSource() == buttonStart){
			//問題クラスの起動
			
		}
	}
	
		
}
