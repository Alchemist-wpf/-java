package cn.itcast.chapter08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


import javax.swing.*;
class ButtonFrame extends JFrame implements ActionListener
{	
	JLabel jlr=new JLabel("红色");
	JLabel jlg=new JLabel("绿色");
	JLabel jlb=new JLabel("蓝色");
	JButton jr1 = new JButton("+");    // 创建按钮对象jb
	JButton jg1 = new JButton("+");
	JButton jb1 = new JButton("+");
	JButton jr2 = new JButton("-");    // 创建按钮对象jb
	JButton jg2 = new JButton("-");
	JButton jb2 = new JButton("-");
	JTextField jtr=new JTextField("0");
	JTextField jtg=new JTextField("0");
	JTextField jtb=new JTextField("0");
	
	int cr=0;
	int cg=0;
	int cb=0;
	
	Container con = this.getContentPane();
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	JPanel jp4=new JPanel();
	public ButtonFrame() 
{
		super("按钮和框架");
		this.setSize(320,240);
		this.setLocation(220, 160);
		
		
		  // 获取框架的内容面板
		con.setLayout(null);
		jp1.setLayout(new GridLayout(3,1));
		jp1.add(jlr);
		jp1.add(jlg);
		jp1.add(jlb);
		jp2.setLayout(new GridLayout(3,3,10,5));
		jp2.add(jr1);
		jp2.add(jtr);
		jp2.add(jr2);
		jp2.add(jg1);
		jp2.add(jtg);
		jp2.add(jg2);
		jp2.add(jb1);
		jp2.add(jtb);
		jp2.add(jb2);
		con.setLayout(new FlowLayout());
		jp4.add(jp1);
		jp4.add(jp2);
		con.setLayout(new GridLayout(2,1));
		con.add(jp4);
		con.add(jp3);
		
		
		
		jr1.addActionListener(this);
		jg1.addActionListener(this);
		jb1.addActionListener(this);
		jr2.addActionListener(this);
		jg2.addActionListener(this);
		jb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jr1)
		{
			if(cr<=245)
				cr+=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtr.setText(Integer.toString(cr));
			
		}
		else if(e.getSource()==jg1) {
			if(cg<=245)
			cg+=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtg.setText(Integer.toString(cg));
			
		}
		else if(e.getSource()==jb1) {
			if(cb<=245)
			cb+=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtb.setText(Integer.toString(cb));
			
		}
		else if(e.getSource()==jr2)
		{
			if(cr>=0)
			cr-=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtr.setText(Integer.toString(cr));
			
		}
		else if(e.getSource()==jg2) {
			if(cg>=0)
			cg-=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtg.setText(Integer.toString(cg));
			
		}
		else if(e.getSource()==jb2) {
			if(cb>=0)
			cb-=10;
			Color c=new Color(cr,cg,cb);
			jp3.setBackground(c);
			jtb.setText(Integer.toString(cb));
			
		}
	}
}
public class Example01{
	public static void main(String args[]) {
		ButtonFrame bf=new ButtonFrame();
		bf.setVisible(true);
	}
}