import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.text.*;

	/* 
	 * JFrameを継承、ActionListenerインターフェイスを使用したコンストラクタ
	 * の生成。
	 */
	public class main extends JFrame implements ActionListener{
	
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
		
		//ボタンの宣言
		String ButtonName[] = {" ","1","2","3","4","5","6","7","8","9","0"};
		
		//土台みたいな感じ
		mainFrame = new JFrame("計算ゲーム");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(300,450);
		mainFrame.setLocationRelativeTo(null);
		
		//数値の表示メソッドを実行
		RandomNumber();
	
		//UIをWindows風に設定（ここは弄らなくて良い）
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//ボタンの宣言、ボタンにActionListenerの機能を付加
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
        
        	//数値表示領域の設定
        	numberField = new JTextField();
        	numberField.setPreferredSize(new Dimension(280,100));

		//フォントの設定
        	numberField.setFont(new Font("",Font.PLAIN,45));
        	
        	//ボタンを載せるためのパネルの生成（GridLayoutを使用）
        	Panel1 = new JPanel();
        	Panel1.setPreferredSize(new Dimension(300,300));
        	GridLayout grid1 = new GridLayout(4,3);
        	Panel1.setLayout(grid1);
        
        	//パネルにボタンを設置
        	for(int i=1;i<=10;i++){
        		Panel1.add(Button[i]);
        	}
        
        	Panel1.add(ButtonClear);
        	Panel1.add(ButtonStart);
        
        	//土台にボタン設置パネルを載せる
        	mainFrame.add(Panel1);
        
        	//数値表示領域を設置するパネルの生成
        	Panel2 = new JPanel();
        	Panel2.setPreferredSize(new Dimension(300,100));
        
        	//数値表示領域をパネルに設置
        	Panel2.add(numberField);
        
        	//BorderLayoutを使用して数値表示領域を載せたパネルを土台に設置
        	mainFrame.add(Panel2,BorderLayout.NORTH);
        	
        	/*
        	 * ユーザーが解答を入力後に押すボタンの宣言。
        	 * このボタンを押すことで正誤判定メソッドが起動
        	 */
        	Panel3 = new JPanel();
        	Panel3.setPreferredSize(new Dimension(300,50));
        	Panel3.add(AnswerCheck);
        	mainFrame.add(Panel3,BorderLayout.SOUTH);
        	
        	//視覚化処理
        	mainFrame.setVisible(true);
        
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
		}else if(event.getSource() == AnswerCheck{
			UserAnswerJudge();
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
	
	//コンピュータの計算判定メソッドの実行(引数取るかもしれんから注意)
	public void UserAnswerJudge(){
		
	}

	/*
	 * main(ここは弄らなくて良い)
	 */
	public static void main(String args[]){
		new main();
	}
}
