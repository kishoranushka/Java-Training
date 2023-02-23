import java.awt.*;
import java.awt.event.*;
class MyFirstGUI extends WindowAdapter
{
	MyFirstGUI()
	{
		Frame f = new Frame();
		Button b=new Button("Click me..");
		
		f.setSize(700,700);

		f.setVisible(true);
		b.setBounds(30,50,80,90);
		f.add(b);
	
		f.setLayout(null);

		
	}

	public void windowClosing(WindowEvent e)
	{
		f.dispose();
	}
}

class Main
{

	public static void main(String[] args) 
	{
		MyFirstGUI G= new MyFirstGUI();
	}
}
