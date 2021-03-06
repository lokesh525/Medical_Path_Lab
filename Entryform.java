import javax.swing.*;
import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import java.awt.Image;
import java.util.Random;

public class Entryform extends JFrame implements ActionListener
{
	Font f;
	MenuBar mbar;
	Menu mastermenu,reportmenu,labmenu;
	MenuItem np,nd,s,bill,dailyt,labentry;
	Image img,img1,img2;
	MediaTracker med;
	Toolkit tk;

	Entryform()
	{
		f=new Font("Serif", Font.BOLD, 16);
		mbar=new MenuBar();
		setMenuBar(mbar);

		mastermenu=new Menu("Master");
		mbar.add(mastermenu);
		np=new MenuItem("New Patient");
		mastermenu.add(np);
		nd=new MenuItem("New Disease");
		mastermenu.add(nd);

		mastermenu.setFont(f);
	//	mastermenu.setColor(Color.red);

		reportmenu=new Menu("Report");
		mbar.add(reportmenu);
		reportmenu.setFont(f);
		s=new MenuItem("See Report");
		reportmenu.add(s);
		bill=new MenuItem("Bill Report");
		reportmenu.add(bill);
		dailyt=new MenuItem("Daily Transaction");
		reportmenu.add(dailyt);

		labmenu=new Menu("Lab");
		mbar.add(labmenu);
		labmenu.setFont(f);
		labentry=new MenuItem("Lab Entry");
		labmenu.add(labentry);

		med=new MediaTracker(this);
		tk=tk.getDefaultToolkit();
		img=tk.getImage("image\\en.jpg");
		img1=tk.getImage("image\\en1.jpg");
		img2=tk.getImage("image\\en2.jpg");

		np.addActionListener(this);
		nd.addActionListener(this);
		dailyt.addActionListener(this);
		s.addActionListener(this);
		bill.addActionListener(this);
		labentry.addActionListener(this);

		Container c=this.getContentPane();
		c.setBackground(Color.white);

		setSize(1368,720);
		setVisible(true);
			
	}

	public void actionPerformed(ActionEvent e1)
	{
		if(e1.getSource()==np)
		{
			Patient pt=new Patient();
		}
		if(e1.getSource()==nd)
		{
		
		}
		if(e1.getSource()==s)
		{
			SReport sp=new SReport();
		}
		if(e1.getSource()==bill)
		{
			BReport bt=new BReport();
		}
		if(e1.getSource()==dailyt)
		{
			Transaction tn=new Transaction();
		}
		if(e1.getSource()==labentry)
		{
		   Labentry le=new Labentry();
		}
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2=(Graphics2D)g;
		g2.drawImage(img,20,15,this);
		g2.drawImage(img1,30,420,this);
		g2.drawImage(img2,1000,100,this);
	}
//	public static void main(String[] args) 
//	{
//		new Entryform();
//	}
}
