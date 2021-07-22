
import javax.swing.*;
import java.awt.event.*;


public class MonkfoxAssesment extends JFrame
{
	JButton addb,clrb;
	static JTextField texf;
	static int index;
	// Declearing all variables
	
	// Creating Labels for tasks
	static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;

	
	public static void main(String[] args)
	{
		MonkfoxAssesment win;
		win=new MonkfoxAssesment();
		
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setSize(500,700);
		win.setVisible(true);
		// Basic settings of frame
		
		texf=new JTextField();
		l1 = new JLabel();			
		l2 = new JLabel();			
		l3 = new JLabel();			
		l4 = new JLabel();
		l5 = new JLabel();			
		l6 = new JLabel();			
		l7 = new JLabel();			
		l8 = new JLabel();			
		l9 = new JLabel();			
		l10 = new JLabel();			
		
		win.setComponents();
		
	}
	
	private void setComponents()
	{
		 addb=new JButton("Add");				// add button
		 clrb=new JButton("Clear");		// close button
		
		// Creating all objects
		
		
		
		index = 1;
		
		add(texf);
		texf.setLocation(25,25);
		texf.setSize(300,25);
		
		addb.addActionListener(new AddTask());
		add(addb);
		addb.setSize(100,25);
		addb.setLocation(350,25);
		
		clrb.addActionListener(new ClearTask());
		add(clrb);
		clrb.setSize(100,25);
		clrb.setLocation(175,600);
	
		
		add(l1);		
		add(l2);		
		add(l3);		
		add(l4);		
		add(l5);		
		add(l6);		
		add(l7);		
		add(l8);		
		add(l9);		
		add(l10);		
	
		l1.setSize(300,25);			
		l2.setSize(300,25);			
		l3.setSize(300,25);			
		l4.setSize(300,25);			
		l5.setSize(300,25);			
		l6.setSize(300,25);			
		l7.setSize(300,25);			
		l8.setSize(300,25);			
		l9.setSize(300,25);			
		l10.setSize(300,25);		
		
		l1.setLocation(25,75);		
		l2.setLocation(25,125);		
		l3.setLocation(25,175);		
		l4.setLocation(25,225);		
		l5.setLocation(25,275);		
		l6.setLocation(25,325);		
		l7.setLocation(25,375);		
		l8.setLocation(25,425);		
		l9.setLocation(25,475);		
		l10.setLocation(25,525);	
		
	}
	
	
	class AddTask extends MonkfoxAssesment implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			switch(index)
			{
				case 1: l1.setText(texf.getText());
						break;		
						
				case 2: l2.setText(texf.getText());
						break;
						
				case 3: l3.setText(texf.getText());
						break;
						
				case 4: l4.setText(texf.getText());
						break;
						
				case 5: l5.setText(texf.getText());
						break;
						
				case 6: l6.setText(texf.getText());
						break;
						
				case 7: l7.setText(texf.getText());
						break;
						
				case 8: l8.setText(texf.getText());
						break;
						
				case 9: l9.setText(texf.getText());
						break;
						
				case 10: l10.setText(texf.getText());
						break;
				
			}
		
			index++;
			texf.setText("");
		}
	}

	
	class ClearTask extends MonkfoxAssesment implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			l1.setText("");
			l2.setText("");
			l3.setText("");
			l4.setText("");
			l5.setText("");
			l6.setText("");
			l7.setText("");
			l8.setText("");
			l9.setText("");
			l10.setText("");
			
			index = 1;
			
		}
	}
}
