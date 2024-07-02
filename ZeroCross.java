import java.awt.*;
import java.awt.event.*;
class Fdemo extends Frame implements ActionListener
{
Button a[];
Fdemo()
{
setLayout(null);
a=new Button[9];
Font f=new Font("Agency FB",Font.BOLD,30);
setFont(f);
int i,j, k=0;
int w=100,h=100;
int x=100,y=100;
for(i=1;i<=3;i++)
{
	for(j=1;j<=3;j++)
	{
		a[k]=new Button();
		a[k].setSize(w,h);
		a[k].setLocation(x,y);
		add(a[k]);
		a[k].addActionListener(this);
		k++;
		x+=100;
	}
	 x=100;
	 y+=100;
}
}
int c=1;
public void actionPerformed(ActionEvent e)
{
	Button b=(Button)e.getSource();
	if(c%2==0)
	{
		b.setLabel("O");
		c++;
	}
	else
	{
		b.setLabel("X");
		c++;
	}
	b.removeActionListener(this);
	String m="X";
	String n="O";
	int t=0,v=0;
	for(int l=0;l<9;l=l+3)
	{
		if((a[l].getLabel()==m && a[l+1].getLabel()==m && a[l+2].getLabel()==m) ||
		   (a[t].getLabel()==m && a[t+3].getLabel()==m && a[t+6].getLabel()==m) ||
		   (a[v].getLabel()==m && a[v+4].getLabel()==m && a[v+8].getLabel()==m) ||
		   (a[v+2].getLabel()==m && a[v+4].getLabel()==m && a[v+6].getLabel()==m))
		   {
			   Label u1=new Label("X wins");
			   u1.setSize(100,60);
			   u1.setLocation(450,100);
			   add(u1);
		   }
		if((a[l].getLabel()==n && a[l+1].getLabel()==n && a[l+2].getLabel()==n) ||
           (a[t].getLabel()==n && a[t+3].getLabel()==n && a[t+6].getLabel()==n) ||
           (a[v].getLabel()==n && a[v+4].getLabel()==n && a[v+8].getLabel()==n) ||
           (a[v+2].getLabel()==n && a[v+4].getLabel()==n && a[v+6].getLabel()==n))
		   {
			   Label u2=new Label("O wins");
               u2.setSize(100,60);
               u2.setLocation(450,100);
			   add(u2);
		   }			   
		   t++;
	}
}
}
class ZeroCross
{
public static void main(String ar[])
{
Fdemo f=new Fdemo();
f.setVisible(true);
f.setSize(800,800);
f.setLocation(100,100);
}
}	