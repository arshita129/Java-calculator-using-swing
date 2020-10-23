import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class calculator_using_swing extends JFrame implements ActionListener{
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,divide,multiply,minus,add,equal,clear;
	JTextField t;
	calculator_using_swing(){
		JFrame f=new JFrame("Calculator");
		f.setSize(800,800);
		b0=new JButton("0");
		b1=new JButton("1");
		b2=new JButton("2");
		b3=new JButton("3");
		b4=new JButton("4");
		b5=new JButton("5");
		b6=new JButton("6");
		b7=new JButton("7");
		b8=new JButton("8");
		b9=new JButton("9");
		divide=new JButton("/");
		minus=new JButton("-");
		add=new JButton("+");
		equal=new JButton("=");
		multiply=new JButton("X");
		clear=new JButton("C");
		f.add(b0);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(divide);
		f.add(multiply);
		f.add(equal);
		f.add(minus);
		f.add(add);
		f.add(clear);
		b9.setBounds(100,100,100,50);
		b8.setBounds(210,100,100,50);
		b7.setBounds(320,100,100,50);
		b6.setBounds(100,160,100,50);
		b5.setBounds(210,160,100,50);
		b4.setBounds(320,160,100,50);
		b3.setBounds(100,220,100,50);
		b2.setBounds(210,220,100,50);
		b1.setBounds(320,220,100,50);
		b0.setBounds(210,280,100,50);
		equal.setBounds(320,280,100,50);
		multiply.setBounds(430,100,100,50);
		minus.setBounds(430,160,100,50);
		add.setBounds(430,220,100,50);
		divide.setBounds(430,280,100,50);
		clear.setBounds(100,280,100,50);
		t=new JTextField();
		t.setBounds(100,30,432,60);
		f.add(t);
		f.setLayout(null);
		f.setVisible(true);
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		minus.addActionListener(this);
		equal.addActionListener(this);
		add.addActionListener(this);
		clear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
			if(e.getSource()==b0)
				t.setText(t.getText()+Integer.toString(0));
			else if(e.getSource()==b1)
				t.setText(t.getText()+Integer.toString(1));
			else if(e.getSource()==b2)
				t.setText(t.getText()+Integer.toString(2));
			else if(e.getSource()==b3)
				t.setText(t.getText()+Integer.toString(3));
			else if(e.getSource()==b4)
				t.setText(t.getText()+Integer.toString(4));
			else if(e.getSource()==b5)
				t.setText(t.getText()+Integer.toString(5));
			else if(e.getSource()==b6)
				t.setText(t.getText()+Integer.toString(6));
			else if(e.getSource()==b7)
				t.setText(t.getText()+Integer.toString(7));
			else if(e.getSource()==b8)
				t.setText(t.getText()+Integer.toString(8));
			else if(e.getSource()==b9)
				t.setText(t.getText()+Integer.toString(9));
			else if(e.getSource()==multiply)
				t.setText(t.getText()+" X ");
			else if(e.getSource()==minus)
				t.setText(t.getText()+" - ");
			else if(e.getSource()==add)
				t.setText(t.getText()+" + ");
			else if(e.getSource()==equal){
				String s=t.getText();
				int res=0;
				String arr[]=s.split(" ");
				//t.setText(arr[0]+","+arr[1]+","+arr[2]+",");
				if(arr[1].equals("+")){
					res=Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
				}
				else if(arr[1].equals("-")){
					res=Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
				}
				else if(arr[1].equals("/")){
					res=Integer.parseInt(arr[0])/Integer.parseInt(arr[2]);
				}
				else if(arr[1].equals("X")){
					res=Integer.parseInt(arr[0])*Integer.parseInt(arr[2]);
				}
				t.setText(String.valueOf(res));
			}
			else if(e.getSource()==divide)
				t.setText(t.getText()+" / ");
			else if(e.getSource()==clear)
				t.setText("");
	}
	public static void main(String[]args){
		new calculator_using_swing();
	}
}