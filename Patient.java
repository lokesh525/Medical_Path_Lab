import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
//import java.awt.Graphics;

public class Patient extends JFrame implements ActionListener, ItemListener
{
	Image img1,img2,img3,img4;
	Toolkit tk;
	MediaTracker me;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,pid;
	TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10;
	Font f1,f2,f3,f4;
	JRadioButton rb1,rb2;
	JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7;
	String day[]={"day","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	String month[]={"month","01","02","03","04","05","06","07","08","09","10","11","12"};
	String year[]={"year","1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"};
	String test[]={"Test Name","TC DC","Haemoglobin","TSR","ABORH","Bilirubin","Creapinine","Sodium Potasium","Calcium","Urine R(E)","Stool R(E)","Sputumfor AFB"};
	String year1[]={"year","2015","2016","2017","2018","2019","2020"};
	TextArea ta;
	JButton b1;
	String pid1,nm,moth,fath,scon1,scon2,ref,ag,add,tes1;
	String s1,s2,s3,s4,s5,s6,s7,s8,tes;

	Patient()
	{
		setSize(1368,720);
	//	setBackground(Color.red);
		
		f1=new Font("Serif",Font.BOLD, 40);
		f2=new Font("Serif",Font.BOLD, 18);
		f3=new Font("Serif",Font.BOLD, 24);
		l1=new Label("NEW PATIENT");
		l1.setBounds(530,50,300,30);
		l1.setFont(f1);
//		l1.setBackground(Color.white);
		l1.setForeground(Color.red);
		add(l1);
		l2=new Label("Name :");
		l2.setBounds(180,150,70,20);
		l2.setFont(f2);
//		l2.setBackground(Color.white);
		add(l2);
		
		l3=new Label("Reffered by :");
		l3.setBounds(180,200,150,20);
		l3.setFont(f2);
//		l3.setBackground(Color.white);
		add(l3);
		l4=new Label("Age :");
		l4.setBounds(180,250,150,20);
		l4.setFont(f2);
//		l4.setBackground(Color.white);
		add(l4);
		l5=new Label("Mother's Name :");
		l5.setBounds(180,300,190,20);
		l5.setFont(f2);
//		l5.setBackground(Color.white);
		add(l5);
		l6=new Label("Father's Name :");
		l6.setBounds(180,350,190,20);
		l6.setFont(f2);
//		l6.setBackground(Color.white);
		add(l6);
		l7=new Label("Sex :");
		l7.setBounds(180,400,80,20);
		l7.setFont(f2);
//		l7.setBackground(Color.white);
		add(l7);
		l8=new Label("DOB :");
		l8.setBounds(180,450,80,20);
		l8.setFont(f2);
//		l8.setBackground(Color.white);
		add(l8);
		l9=new Label("Address :");
		l9.setBounds(180,500,100,20);
		l9.setFont(f2);
		add(l9);
		l10=new Label("Investigation Desire");
		l10.setBounds(950,200,210,30);
		l10.setFont(f3);
		l10.setForeground(Color.blue);
		add(l10);

		l11=new Label("Date");
		l11.setBounds(935,340,40,30);
		l11.setFont(f2);
		l11.setForeground(Color.blue);
		add(l11);
		cb5=new JComboBox(day);
		cb5.setBounds(985,344,50,23);
		add(cb5);
		cb6=new JComboBox(month);
		cb6.setBounds(1036,344,64,23);
		add(cb6);
		cb7=new JComboBox(year1);
		cb7.setBounds(1101,344,55,23);
		add(cb7);
		pid=new Label("Patient Id");
		pid.setBounds(935,430,90,30);
		pid.setFont(f2);
		pid.setForeground(Color.red);
		add(pid);
		
		cb1=new JComboBox(day);
		cb1.setBounds(400,450,50,23);
//		cb1.setBackground(Color.white);
		//cb1.add("day");
		add(cb1);
		cb2=new JComboBox(month);
		cb2.setBounds(450,450,68,23);
		add(cb2);
		cb3=new JComboBox(year);
		cb3.setBounds(518,450,60,23);
		add(cb3);
		cb4=new JComboBox(test);
		cb4.setBounds(975,250,160,27);
		add(cb4);

		cb1.addItemListener(this);
		cb2.addItemListener(this);
		cb3.addItemListener(this);
		cb4.addItemListener(this);
		cb5.addItemListener(this);
		cb6.addItemListener(this);
		cb7.addItemListener(this);

		b1=new JButton("Submit");
		b1.setBounds(1020,560,100,25);
		b1.setBackground(Color.white);
		b1.setForeground(Color.red);
		add(b1);
		b1.addActionListener(this);

		rb1=new JRadioButton("Male");
		rb2=new JRadioButton("Female");
		rb1.setBounds(400,400,75,25);
		rb2.setBounds(470,400,75,25);
		rb1.setBackground(Color.white);
		rb2.setBackground(Color.white);
		add(rb1);
		add(rb2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);

		rb1.addItemListener(this);
		rb2.addItemListener(this);

		tf1=new TextField();

		tf1.setBounds(400,150,200,25);
		add(tf1);

		tf2=new TextField();
		tf2.setBounds(400,200,200,25);
		tf2.setText("Dr. ");
		add(tf2);

		tf3=new TextField();
		tf3.setBounds(400,250,40,25);
		add(tf3);

		tf4=new TextField();
		tf4.setBounds(400,300,200,25);
		add(tf4);

		tf5=new TextField();
		tf5.setBounds(400,350,200,25);
		add(tf5);

		tf6=new TextField("00001");
		tf6.setBounds(1036,431,72,28);
		tf6.setFont(f2);
		tf6.setForeground(Color.red);
		add(tf6);

		ta=new TextArea();
		ta.setBounds(400,500,200,100);
		add(ta);

		me=new MediaTracker(this);
		tk=tk.getDefaultToolkit();
		img1=tk.getImage("image\\p1.jpg");
		img2=tk.getImage("image\\p2.jpg");
		//img3=tk.getImage("D:\\p3.jpg");
		
		Container c=this.getContentPane();
		c.setBackground(Color.white);
		
		setLayout(null);
		
		setVisible(true);
		}
	//	public void selectedIndexChanged(SelectionEvent)

		public void itemStateChanged(ItemEvent e2)
		{
			 s1=cb1.getSelectedItem().toString();
			 s2=cb2.getSelectedItem().toString();
			 s3=cb3.getSelectedItem().toString();
			 scon1=s1+"/"+s2+"/"+s3;
			
			 tes1=cb4.getSelectedItem().toString();
			 s4=cb5.getSelectedItem().toString();
			 s5=cb6.getSelectedItem().toString();
			 s6=cb7.getSelectedItem().toString();
			 scon2=s4+"/"+s5+"/"+s6;

			// s7=rb1.getSelectedItem().toString();
		}
	//	System.out.println();
		

		public void actionPerformed(ActionEvent e1)
		{
			if(e1.getSource()==b1)
			{
				 nm=tf1.getText();
				 ref=tf2.getText();
				 ag=tf3.getText();
				 moth=tf4.getText();
				 fath=tf5.getText();
				 pid1=tf6.getText();
				 add=ta.getText();

				DataBase1 db=new DataBase1();
				try
				{
			
					int i=db.st.executeUpdate("insert into patiententry values("+"'"+pid1+"'"+","+"'"+nm+"'"+","+"'"+ref+"'"+","+"'"+ag+"'"+","+"'"+moth+"'"+","+"'"+fath+"'"+",'Male',"+"'"+scon1+"'"+","+"'"+add+"'"+","+"'"+tes1+"'"+","+"'"+scon2+"')");
	
				}
				catch (Exception e8)
				{
					e8.printStackTrace();
				}
			}
		}
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		float dashes[]={10,6};
		
		g2.drawImage(img1,30,25,this);
		g2.drawImage(img2,290,160,this);
		//g2.drawImage(img3,975,250,this);
		g2.drawRect(150,160,500,510);
		g2.setColor(Color.red);
		g2.setStroke(new BasicStroke(2,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,10,dashes,2));
		

		g2.drawLine(920,250,1210,250);
		g2.drawLine(920,250,920,560);
		g2.drawLine(920,560,1210,560);
		g2.drawLine(1210,560,1210,250);

		
		g2.setColor(Color.blue);
		g2.setStroke(new BasicStroke(3,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND,10,dashes,2));
		g2.drawLine(150,160,650,160);
		g2.drawLine(150,160,150,670);
		g2.drawLine(150,670,650,670);
		g2.drawLine(650,670,650,160);
	}
//	public static void main(String[] args) 
//	{
//		new Patient();
//	}
}
