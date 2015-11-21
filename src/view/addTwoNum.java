package view;

import javax.swing.*;

public class addTwoNum extends JFrame {
	
	private JLabel firstNumL, secondNumL;
	private JButton calculateButton;
	private JTextField firstNumTF;
	private JTextField secondNumTF;
	private JPanel addTwoNumPanel;
	
	addTwoNum(){
		setupFrame();
		initialize();
		setupLayout();
		setVisible(true);
	}
	
	public void setupFrame(){
		setSize(400,400);
		setTitle("Add two Numbers");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void initialize(){
		addTwoNumPanel = new JPanel();
		addTwoNumPanel.setLayout(null);
		getContentPane().add(addTwoNumPanel);
		
		firstNumL = new JLabel("Enter First Number");
		secondNumL = new JLabel("Enter Second Number");
		
		firstNumTF = new JTextField(10);
		secondNumTF = new JTextField(10);
		
		calculateButton = new JButton("Calculate");
		}
	public void setupLayout(){
		addTwoNumPanel.add(firstNumL);
		addTwoNumPanel.add(firstNumTF);
		addTwoNumPanel.add(secondNumL);
		addTwoNumPanel.add(secondNumTF);
		addTwoNumPanel.add(calculateButton);
		
		
		firstNumL.setBounds(0,0,100,200);
		firstNumTF.setBounds(0,0,100,200);
		secondNumL.setBounds(0,0,100,200);
		secondNumTF.setBounds(0,0,100,200);
		calculateButton.setBounds(0,0,100,200);
		
	}
}	
