package uilearning;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class SwingButton {

	public static void main(String[] args) 
	{
		
	    JFrame f=new JFrame("User details");  
	    JTextField tf=new JTextField(); 
	    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	    JLabel l1,l2,l3,l4,l5,l6,l7,lr1,lr2,lr3,lr4,lr5,lr6,lr7; 
	    
	    l1=new JLabel("First Name :");  
	    l1.setBounds(50,50, 100,30);
	    tf1=new JTextField();
	    tf1.setBounds(200, 50, 100, 30);
	    
	    l2=new JLabel("Last Name :");  
	    l2.setBounds(50,100, 100,30);
	    tf2=new JTextField();
	    tf2.setBounds(200, 100, 100, 30);
	    
	    l3 = new JLabel("User Number :");
	    l3.setBounds(50,150, 100,30);
	    tf3=new JTextField();
	    tf3.setBounds(200, 150, 100, 30);
	    
	    l4 = new JLabel("Password :");
	    l4.setBounds(50,200, 100,30);
	    tf4=new JTextField();
	    tf4.setBounds(200, 200, 100, 30);
	    
	    l5 = new JLabel("Re Pass :");
	    l5.setBounds(50,250, 100,30);
	    tf5=new JTextField();
	    tf5.setBounds(200, 250, 100, 30);
	    
	    l6 = new JLabel("Mob :");
	    l6.setBounds(50,300, 100,30);
	    tf6=new JTextField();
	    tf6.setBounds(200, 300, 100, 30);
	    
	    l7 = new JLabel("Email :");
	    l7.setBounds(50,350, 100,30);
	    tf7=new JTextField();
	    tf7.setBounds(200, 350, 100, 30);
	    
	   JButton b=new JButton("SUBMIT");  
	   b.setBounds(150,400,95,30); 
	    
	    f.add(l1); f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);
	    f.add(tf1);f.add(tf2);f.add(tf3);f.add(tf4);f.add(tf5);f.add(tf6);f.add(tf7);
	    
	    
	    lr1 = new JLabel();
	    lr1.setBounds(50,450, 100,30);
	    
	    lr2 = new JLabel();
	    lr2.setBounds(50,500, 100,30);
	    
	    lr3 = new JLabel();
	    lr3.setBounds(50,550, 100,30);
	    
	    lr4 = new JLabel();
	    lr4.setBounds(50,600, 100,30);
	    
	    lr5 = new JLabel();
	    lr5.setBounds(50,650, 100,30);
	    
	    lr6 = new JLabel();
	    lr6.setBounds(50,700, 100,30);
	    
	    lr7 = new JLabel();
	    lr7.setBounds(50,750, 100,30);

	    
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e)
	    	{  
	    		lr1.setText(tf1.getText());
	    		lr2.setText(tf2.getText());
	    		lr3.setText(tf3.getText());
	    		lr4.setText(tf4.getText());
	    		lr5.setText(tf5.getText());
	    		lr6.setText(tf6.getText());
	    		lr7.setText(tf7.getText());
	    		
	             
			        }  
			    });  
	    f.add(b);f.add(tf); 
	    f.add(lr1);
	    f.add(lr2);
	    f.add(lr3);
	    f.add(lr4);
	    f.add(lr5);
	    f.add(lr6);
	    f.add(lr7);
	    f.setSize(800,1000);  
	    f.setLayout(null);  
	    f.setVisible(true);  
		
		
	}
}
