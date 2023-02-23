import java.awt.*;
import java.awt.event.*;
class registration_form2 
{
	Frame f;
	Label l1,l2,l3,l4,l5;
	Panel p;
	Button b1,b2,b3;
	TextField t1,t3,t2,t4;
	TextArea T;
	
	registration_form2 ()
	{
		f= new Frame("REGISTRATION FORM");
		f.setBackground(Color.orange);
		p = new Panel();
		l1 = new Label("Enrolment");
		l2 = new Label("Name");
		l3 = new Label("Branch");
		l4 = new Label("Semester");
		l5 = new Label("Information");
		t1 = new TextField();
		t3 = new TextField();
		t2 = new TextField();
		t4 = new TextField();
		T= new TextArea("Anushka",1,15);
		b1= new Button("Submit");
		
		
		p.add(l1); p.add(t1);
		p.add(l2); p.add(t2);
		p.add(l3); p.add(t3);
		p.add(l4); p.add(t4);
		p.add(l5); p.add(T);
		p.add(b1);
		p.setLayout(new GridLayout(6,2));
		f.add(p);
		f.setLayout(new FlowLayout());
		f.setSize(1000,1000);
		f.setVisible(true);
		
	}

	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
}
class  registration_form
{
	public static void main(String[] args) 
	{
		registration_form2  A= new registration_form2 ();
	}
}