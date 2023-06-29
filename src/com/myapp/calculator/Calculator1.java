package com.myapp.calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator1 implements ActionListener{
	
	boolean isOperatorClicked=false;
	String oldValue;
	int Label;
	float result;
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equaltoButton;
	JButton divitionButton;
	JButton minusButton;
	JButton mulButton;
	JButton plusButton;
	JButton clearButton;
	
	public Calculator1() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		Font font =new Font("Arial",Font.PLAIN, 40);
		
		sevenButton=new JButton(" 7 ");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(font);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton(" 8 ");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.setFont(font);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton(" 9 ");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.setFont(font);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton=new JButton(" 4 ");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(font);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton(" 5 ");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(font);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton(" 6 ");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.setFont(font);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton(" 1 ");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(font);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton=new JButton(" 2 ");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(font);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton=new JButton(" 3 ");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.setFont(font);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(" . ");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(font);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton(" 0 ");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(font);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equaltoButton=new JButton(" = ");
		equaltoButton.setBounds(230, 430, 80, 80);
		equaltoButton.setFont(font);
		equaltoButton.addActionListener(this);
		jf.add(equaltoButton);
		
		divitionButton=new JButton(" / ");
		divitionButton.setBounds(330, 130, 80, 80);
		divitionButton.setFont(font);
		divitionButton.addActionListener(this);
		jf.add(divitionButton);
		
		mulButton=new JButton(" * ");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.setFont(font);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton(" - ");
		minusButton.setBounds(330, 330, 80, 80);
		minusButton.setFont(font);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton(" + ");
		plusButton.setBounds(330, 430, 80, 80);
		plusButton.setFont(font);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setFont(font);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String ar[]) {
		
		Calculator1 c=new Calculator1();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				String labelText=displayLabel.getText();
				displayLabel.setText(labelText+"7");
			}
		}else if(e.getSource()== eightButton) {
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}else if(e.getSource()== nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}else if(e.getSource()== fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}else if(e.getSource()== fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}else if(e.getSource()== sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}else if(e.getSource()== oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}else if(e.getSource()== twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}else if(e.getSource()== threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}else if(e.getSource()== dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}else if(e.getSource()== zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}else if(e.getSource()== equaltoButton) {
			
			
			
			String newValue=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			if(Label==3) {
				result=oldValueF+newValueF;
			}else if(Label==1) {
				result=oldValueF/newValueF;
			}else if(Label==2) {
				result=oldValueF-newValueF;
			}else if(Label==4) {
				result=oldValueF*newValueF;
			}
			
			displayLabel.setText(result+"");
			
			
		}else if(e.getSource()== divitionButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			Label=1;
			
		}else if(e.getSource()== minusButton) {
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			Label=2;
			
		}else if(e.getSource()== plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			Label=3;
			
		}else if(e.getSource()== mulButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			Label=4;
			
		}else if(e.getSource()== clearButton) {
			
			displayLabel.setText("");
		}
			
		// TODO Auto-generated method stub
		
	}

}
