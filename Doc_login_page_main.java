package Doctor_database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Under_login implements ActionListener
{
	JFrame jf;
	JLabel welcome,user,pass;
	JTextField ut;
	JPasswordField pt;
	JButton Login;
	Doctors doctor=new Doctors();
	
	public Under_login()
	{
		jf=new JFrame("Login in Doctor DataBase");
		jf.setSize(400,600);
		jf.setLayout(null);
		
		welcome=new JLabel("WEL-COME TO DOCTOR DATABASE MANAGEMENT");
		welcome.setBounds(45, 30, 300,60);
		
		user=new JLabel("Username: ");
		user.setBounds(55, 180, 90,60);
		
		ut=new JTextField();
		ut.setBounds(95, 223, 90, 30);
		
		pass=new JLabel("Password: ");
		pass.setBounds(55, 240, 90,60);
		
		pt=new JPasswordField();
		pt.setBounds(95, 285, 90, 30);
		
		Login=new JButton("Login");
		Login.setBounds(100, 350, 90, 30);
		Login.addActionListener(this);
		
		
		jf.add(welcome);
		jf.add(user);
		jf.add(ut);
		jf.add(pt);
		jf.add(pass);
		jf.add(Login);
		jf.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent login) {
		String username=ut.getText();
		String password=pt.getText();
		
		if(username.equals("database") && password.equals("data@123"))
		{
			JOptionPane.showMessageDialog(null, " Correct Password ", " Login Page ", 1);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Wrong Password ", " Login Page ", 2);
			System.exit(0);
		}
		
		if(login.getSource()==Login)
		{
			doctor.Doctors();
		}
		
	}
	
}
public class Doc_login_page_main {

	public static void main(String[] args) {
		new Under_login();

	}

}
