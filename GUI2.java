import java.awt.*;
import java.awt.event.*;
class myframe 
{
	Frame f;
	Label l1,l2,l3;
	Panel p;
	Button b1,b2,b3;
	TextField t1,t3,t2;
	
	myframe()
	{
		f= new Frame("AWT GUI APPLICATION");
		p = new Panel();
		l1 = new Label("Enter 1st Number");
		l2 = new Label("Enter 1st Number");
		l3 = new Label("Enter 1st Number");
		t1 = new TextField();
		t3 = new TextField();
		t2 = new TextField();
		b1= new Button("COMPUTE");
		b2= new Button("REFRESH");
		b3= new Button("EXIT");
		p.add(l1); p.add(t1);
		p.add(l2); p.add(t2);
		p.add(l3); p.add(t3);
		p.add(b1); p.add(b2);p.add(b3);
		p.setLayout(new GridLayout(5,6));
		f.add(p);
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		f.setVisible(true);
		f.setBackground(Color.red);
	}
}
class GUI2 
{
	public static void main(String[] args) 
	{
		myframe A= new myframe();
	}
}
