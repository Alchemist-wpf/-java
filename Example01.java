package cn.itcast.chapter08;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;


import javax.swing.*;
class ButtonFrame extends JFrame implements ActionListener
{	JButton jr = new JButton("��ɫ");    // ������ť����jb
	JButton jg = new JButton("��ɫ");
	JButton jb = new JButton("��ɫ");
	int cr=0;
	int cg=0;
	int cb=0;
	Container con = this.getContentPane();
	JLabel jl=new JLabel("��ԭɫֵΪ��"+cr+","+cg+","+cb);
	public ButtonFrame() 
{
		super("��ť�Ϳ��");
		this.setSize(320,240);
		this.setLocation(220, 160);
		
		
		  // ��ȡ��ܵ��������
		con.setLayout(null);
		jl.setSize(2220,180);
		jl.setLocation(120,150);
		jl.setForeground(Color.PINK);
		con.add(jl);
		con.add(jr);     // �Ѱ�ť����jb�����������
		jr.setBackground(Color.RED);
		jr.setSize(80,40);
		jr.setLocation(20,80);
		con.add(jg);
		jg.setBackground(Color.GREEN);
		jg.setSize(80,40);
		jg.setLocation(120,80);
		con.add(jb);
		jb.setBackground(Color.blue);
		jb.setSize(80,40);
		jb.setLocation(220,80);
		jr.addActionListener(this);
		jg.addActionListener(this);
		jb.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==jr)
		{
			cr+=10;
			Color c=new Color(cr,cg,cb);
			con.setBackground(c);
			jl.setText("("+cr+","+cg+","+cb+")");
		}
		else if(e.getSource()==jg) {
			cg+=10;
			Color c=new Color(cr,cg,cb);
			con.setBackground(c);
			jl.setText("("+cr+","+cg+","+cb+")");
		}
		else if(e.getSource()==jb) {
			cb+=10;
			Color c=new Color(cr,cg,cb);
			con.setBackground(c);
			jl.setText("("+cr+","+cg+","+cb+")");
		}
	}
}
public class Example01{
	public static void main(String args[]) {
		ButtonFrame bf=new ButtonFrame();
		bf.setVisible(true);
	}
}