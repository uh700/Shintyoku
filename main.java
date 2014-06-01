import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.text.*;

	public class main extends JFrame implements ActionListener{
	
	/*
	 * ������
	 */
	private static final long serialVersionUID = -1254910003483488734L;
	private JFrame mainFrame;
	private JTextField numberField;
	private JPanel Panel1;
	private JPanel Panel2;
	private JPanel Panel3;
	private JButton Button[] = new JButton[11];
	private JButton ButtonClear;
	private JButton ButtonStart;
	private JButton AnswerCheck;
	private int question1;
	private int question2;
	private String setText;
	private String UserAnswer;
	private String num1;
	
	
	//主なGUIコンポーネントの実装
	public main(){
	
		String ButtonName[] = {" ","1","2","3","4","5","6","7","8","9","0"};
		//mainFrame���������
		mainFrame = new JFrame("計算ゲーム");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300,450);
		mainFrame.setLocationRelativeTo(null);
		
		//数値の表示
		RandomNumber();
	
		//���������Windows������������
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

		for(int i=1;i<=10;i++){
			Button[i] = new JButton(ButtonName[i]);
			Button[i].addActionListener(this);
		}
		AnswerCheck = new JButton("チェック");
		AnswerCheck.addActionListener(this);
		AnswerCheck.setSize(300,50);
        	ButtonClear = new JButton("C");
        	ButtonClear.addActionListener(this);
        	ButtonStart = new JButton("S");
        	ButtonStart.addActionListener(this);
        
        	//������������������������������������
        	numberField = new JTextField();
        	numberField.setPreferredSize(new Dimension(280,100));

		 //���������������������
        	numberField.setFont(new Font("",Font.PLAIN,45));
        	
        	//Panel1���������
        	Panel1 = new JPanel();
        	Panel1.setPreferredSize(new Dimension(300,300));
        	GridLayout grid1 = new GridLayout(4,3);
        
        	//Panel1���GridLayout
        	Panel1.setLayout(grid1);
        
        	//Panel1���Button���������
        	for(int i=1;i<=10;i++){
        		Panel1.add(Button[i]);
        	}
        
        	Panel1.add(ButtonClear);
        	Panel1.add(ButtonStart);
        
        	//Panel1���ContantPane���������
        	mainFrame.add(Panel1);
        
        	//Panel2���������
        	Panel2 = new JPanel();
        	Panel2.setPreferredSize(new Dimension(300,100));
        
        	//Panel2���TextField���������
        	Panel2.add(numberField);
        
        	//Panel2���ContantPane���������
        	mainFrame.add(Panel2,BorderLayout.NORTH);
        
        	Panel3 = new JPanel();
        	Panel3.setPreferredSize(new Dimension(300,50));
        	Panel3.add(AnswerCheck);
        	mainFrame.add(Panel3,BorderLayout.SOUTH);
        
        	mainFrame.setVisible(true);
        
        	//コンピュータの計算処理
        	mainGame(); 
	}
	
	//ActionListenerインターフェイスの定義
	public void actionPerformed(ActionEvent event) {
		NumberFormat formatter = NumberFormat.getNumberInstance(); 
		formatter.setMaximumFractionDigits(16);
		Object source = event.getSource(); 
		if(Button[1].equals(source)){
			num1 = "1";
			numberField.setText(num1);
		}else if(Button[2].equals(source)){
			num1 = "2";
			numberField.setText(num1);
		}else if(Button[3].equals(source)){
			num1 = "3";
			numberField.setText(num1);
		}else if(Button[4].equals(source)){
			num1 = "4";
			numberField.setText(num1);
		}else if(Button[5].equals(source)){
			num1 = "5";
			numberField.setText(num1);
		}else if(Button[6].equals(source)){
			num1 = "6";
			numberField.setText(num1);
		}else if(Button[7].equals(source)){
			num1 = "7";
			numberField.setText(num1);
		}else if(Button[8].equals(source)){
			num1 = "8";
			numberField.setText(num1);
		}else if(Button[9].equals(source)){
			num1 = "9";
			numberField.setText(num1);
		}else if(Button[10].equals(source)){
			num1 = "0";
			numberField.setText(num1);
		}else if(event.getSource() == ButtonClear){
			num1 = null;
			numberField.setText(num1);
		}else if(event.getSource() == ButtonStart){
			numberField.setText(setText);
		}
	}
	
	public void RandomNumber(){
		//operationの宣言
		String[] operation = {"＋","−","×","÷"};
			
		//operationの内容をランダムにstrに代入
		Random rnd = new Random();
		String str;
		int random = rnd.nextInt(4);
		str = operation[random];
			
		//question１の数値をランダムに生成
		question1 = rnd.nextInt(100)+1;
			
		//question2の数値をランダムに生成
		question2 = rnd.nextInt(100)+1;
			
		//question1,2の値をString型に変換
		String StrQuesrion1 = Integer.toString(question1);
		String StrQuesrion2 = Integer.toString(question2);
			
		setText = StrQuesrion1+str+StrQuesrion2+"=";
	}
	
	public void mainGame(){
		//コンピュータの計算判定
	}

	/*
	 * main
	 */
	public static void main(String args[]){
		new main();
	}
}
