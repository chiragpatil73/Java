package Doctor_database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Content_gui implements ActionListener
{
	JFrame jf;
	JLabel name,age,gender,spe,exp,hosname,sov,sal,welcome;
	JTextField nt,at,gt,st,et,ht,sot,sat;
	JButton Submit,show;
	Datatype obj=new Datatype();
	
	public void Content_gui()
	{
		jf=new JFrame("Add new Details");
		jf.setSize(400,600);
		jf.setLayout(null);
		
		welcome=new JLabel("WEL-COME TO DOCTOR DATABASE MANAGEMENT");
		welcome.setBounds(45, 30, 300,60);
		
		name=new JLabel("Doctor Name: ");
		name.setBounds(55, 100, 90,60);
		
		nt=new JTextField();
		nt.setBounds(150, 118, 120,25);
		
		age=new JLabel("Doctor Age: ");
		age.setBounds(55, 135, 300,60);
		
		at=new JTextField();
		at.setBounds(150, 153, 120,25);
		
		gender=new JLabel("Doctor Gender: ");
		gender.setBounds(55, 170, 300,60);
		
		gt=new JTextField();
		gt.setBounds(150, 190, 120,25);
		
		spe=new JLabel("Doctor Specitalization: ");
		spe.setBounds(55, 210, 300,60);
		
		st=new JTextField();
		st.setBounds(190, 230, 120,25);
		
		exp=new JLabel("Doctor Experiences: ");
		exp.setBounds(55, 240, 300,60);
		
		et=new JTextField();
		et.setBounds(190, 260, 120,25);
		
		hosname=new JLabel("Hospital Name: ");
		hosname.setBounds(55, 270, 300,60);
		
		ht=new JTextField();
		ht.setBounds(190, 290, 120,25);
		
		sov=new JLabel("Doc Solved Case: ");
		sov.setBounds(55, 300, 300,60);
		
		sot=new JTextField();
		sot.setBounds(190, 320, 120,25);
		
		sal=new JLabel("Doctor Salary: ");
		sal.setBounds(55, 340, 90,60);
		
		sat=new JTextField();
		sat.setBounds(150, 360, 120,25);
		
		Submit=new JButton("Submit");
		Submit.setBounds(50, 410, 90, 30);
		Submit.addActionListener(this);
		
		show=new JButton("Show My Details");
		show.setBounds(180, 410, 150, 30);
		show.addActionListener(this);
		
		
		
		jf.add(name);
		jf.add(nt);
		jf.add(age);
		jf.add(at);
		jf.add(gender);
		jf.add(gt);
		jf.add(spe);
		jf.add(st);
		jf.add(exp);
		jf.add(et);
		jf.add(hosname);
		jf.add(ht);
		jf.add(sov);
		jf.add(sot);
		jf.add(sal);
		jf.add(sat);
		jf.add(Submit);
		jf.add(show);
		jf.add(welcome);
		jf.setVisible(true);
		
		 
//		  System.out.println(obj.salary[5]);
		  
	}
	public void get_detail()
	{
		obj.name[5]=nt.getText();
		  obj.age[5]=at.getText();
		  obj.gender[5]=gt.getText();
		  obj.spe[5]=st.getText();
		  obj.exp[5]=et.getText();
		  obj.hosName[5]=ht.getText();
		  obj.solcase[5]=sot.getText();
		  obj.salary[5]=sat.getText();
			
				
    }
	public void show_detail()
	{
		System.out.println("Doctor Name: "+obj.name[5]);
		System.out.println("Doctor age: "+obj.age[5]);
		System.out.println("Doctor Gender: "+obj.gender[5]);
		System.out.println("Doctor Specitalization: "+obj.spe[5]);
		System.out.println("Doctor Solved Case: "+obj.solcase[5]);
		System.out.println("Doctor Salary: "+obj.salary[5]);
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		  
		  
		  if (e.getSource()==Submit)
		  {
			  JOptionPane.showMessageDialog(null, " YOUR DETAILS IS SAVE IN DATABASE ", " Login Page ", 1);
			  System.exit(0);
		  }
		  else if (e.getSource()==show)
		  {
			  get_detail();
			  show_detail();
		  }

	}
}
public class Gui {

	public static void main(String[] args) {
		new Content_gui();

	}

}
