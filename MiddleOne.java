package Doctor_database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Doctors implements ActionListener
{
	JFrame jf;
	JLabel list,welcome;
	JButton one,two,three,four,five,add;
	Methods method=new Methods();
	Content_gui contentgui=new Content_gui();
	public void Doctors()
	{
		jf=new JFrame("Add new Details");
		jf.setSize(400,600);
		jf.setLayout(null);
		
		welcome=new JLabel("WEL-COME TO DOCTOR DATABASE MANAGEMENT");
		welcome.setBounds(45, 30, 300,60);
		
		list=new JLabel("List of the Doctors:");
		list.setBounds(45, 90, 300,60);
		
		one=new JButton("DR.Rufash Nayak");
		one.setBounds(80, 135, 150, 30);
		one.addActionListener(this);
		two=new JButton("DR.Chirag Patil");
		two.setBounds(80, 173, 150, 30);
		two.addActionListener(this);
		three=new JButton("DR.Iftekhar Ahmad");
		three.setBounds(80, 210, 150, 30);
		three.addActionListener(this);
		four=new JButton("DR.Himanshu Kumar");
		four.setBounds(80, 250, 150, 30);
		four.addActionListener(this); 
		five=new JButton("DR.Purna Reddy");
		five.setBounds(80, 290, 150, 30);
		five.addActionListener(this);
		add=new JButton("ADD New Data in Doctor Database");
		add.setBounds(50, 350, 250, 30);
		add.addActionListener(this);
		
		
		
		
		jf.add(welcome);
		jf.add(list);
		jf.add(one);
		jf.add(two);
		jf.add(three);
		jf.add(four);
		jf.add(five);
		jf.add(add);
		jf.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent calling)
	{
		if(calling.getSource()==one)
		{
			method.dr_rufash();
		}
		else if(calling.getSource()==two)
		{
			method.dr_chirag();
		}
		else if(calling.getSource()==three)
		{
			method.dr_iftekhar();
		}
		else if(calling.getSource()==four)
		{
			method.dr_himanshu();
		}
		else if (calling.getSource()==five)
		{
			method.dr_purna();
		}
		else if(calling.getSource()==add)
		{
			contentgui.Content_gui();
		}
	}
}
public class MiddleOne {

	public static void main(String[] args) {
		Doctors obj=new Doctors();
		obj.Doctors();
	}

}
