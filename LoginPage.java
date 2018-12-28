import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
public class LoginPage implements ActionListener{
	JFrame f;
	JPanel p;
	
	JLabel luser,lpass;
	JTextField tuser;
	JPasswordField jpass;
	JButton bLogin,breset;
	LoginPage()
	{
		f=new JFrame("LOGINPAGE");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		
		p=new JPanel();
		f.add(p);
		p.setLayout(new GridLayout(3,2,5,10));
		
		luser=new JLabel("username");
		tuser=new JTextField(10);
		lpass=new JLabel("Password");
		jpass=new JPasswordField(10);
		bLogin=new JButton("Login");
		breset=new JButton("Reset");
		
		p.add(luser);
		p.add(tuser);
		p.add(lpass);
		p.add(jpass);
		p.add(bLogin);
		p.add(breset);
		
		bLogin.addActionListener(this);
		breset.addActionListener(this);
		tuser.addMouseListener(new ch());
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==bLogin)
		{
			if(tuser.getText().equals("admin"))
			{
				if(jpass.getText().equals("admin"))
				{	
				f.dispose();
				
				new RegistrationForm();
				}
				else 
				{
					System.out.println("Incorrect Password");
				}
			}
			else
			{
				System.out.println("Incorrect username");
			}
		}
		if(e.getSource()==breset)
		{
			String s="enter username";
			tuser.setForeground(Color.PINK);
			tuser.setEditable(false);
			tuser.setText(s);
			jpass.setText("");
		}
	}
	public class ch extends MouseAdapter
	{
		public void mouseClicked(MouseEvent e)
		{
			tuser.setEditable(true);
			tuser.setText("");
			tuser.setForeground(Color.BLACK);
		}
	}
	public static void main(String args[])
	{
		new LoginPage();
	}
}
