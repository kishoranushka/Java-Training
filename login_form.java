import java.awt.*;
import java.awt.event.*;
class login_form2 extends WindowAdapter
{
	Frame f;
	Label l1,l2;
	Panel p;
	Button b1;
	TextField t1,t2;
	

	login_form2 ()
	{
		f= new Frame("LOGIN FORM");
		f.setBackground(Color.pink);
		p = new Panel();
		l1 = new Label("User Name:");
		l2 = new Label("Password:");
		
		t1 = new TextField();
		t2 = new TextField();
		
		b1= new Button("LOG IN");
		
		
		p.add(l1); p.add(t1);
		p.add(l2); p.add(t2);
		
		p.add(b1);
		p.setLayout(new GridLayout(3,2));
		f.add(p);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);
		f.setSize(1000,1000);
		f.setVisible(true);
		
	}

	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
}
class  login_form
{
	public static void main(String[] args) 
	{
		login_form2  A= new login_form2 ();
	}
}