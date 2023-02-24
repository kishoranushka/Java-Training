import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Swing_Example implements ActionListener
{
	Frame f;
	JButton b;
	TextField t1,t2,t3;
	JLabel l1,l2,l3,l4,l5;
	JPanel p;
	Swing_Example()
	{
		 f=new Frame("Average calculator of three numbers");
		 f.setSize(500,500);
		 f.setVisible(true);
		 f.setLayout(new FlowLayout());
		 
		

		 p= new JPanel();
		 p.setLayout(new GridLayout(6,2));

		 ImageIcon icon1= new ImageIcon("1.jpg");
			 ImageIcon icon2= new ImageIcon("2.jpg");
		 ImageIcon icon3= new ImageIcon("3.jpg");
			 ImageIcon icon4= new ImageIcon("A.jpg");
			 ImageIcon icon5= new ImageIcon("CA.jpg");
			 
			 b= new JButton(icon5);
			  b.setBounds(30,40,50,60);

		t1= new TextField();
		t2= new TextField();
		t3= new TextField();

		l1= new JLabel(icon1);
		l2= new JLabel(icon2);
		l3= new JLabel(icon3);
		l4= new JLabel(icon4);
		l5= new JLabel(icon5);
		f.add(p);

		p.add(l1);p.add(t1);
		p.add(l2);p.add(t2);
		p.add(l3);p.add(t3);
		p.add(l4);p.add(l5);
		p.add(b);
		
			 }
	
}
class Swing_ExampleMain
{
	public static void main(String[] args) 
	{
		Swing_Example E= new Swing_Example();
	}
}