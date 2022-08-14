import java.awt.*;
import java.lang.*;
import java.awt.event.*;
public class sap1 extends Frame
{
static sap1 s1;
static sap2 s2;
static  sap3 s3;
public Label l1,l2,l3,l4,l5,l6,l7,l8;
public TextField t1,t2,t3,t4,t5,t6;
public Choice  cat;
public Button b1,b2;

sap1()
{
s2=new sap2();
s2.setSize(300,300);

s3=new sap3();
s3.setSize(300,300);


Panel p1=new  Panel();
p1.setBackground(Color.CYAN);
add(p1);
p1.setLayout(new GridLayout(3,8));

l1=new Label("STUDENT ADMIN PORTAL",Label.CENTER);
p1.add(l1);



Panel p2=new Panel();
p2.setLayout(new GridLayout(8,2));
p1.add(p2);

l2=new Label("Name");
p2.add(l2);
t1=new TextField(20);
p2.add(t1);


l3=new Label("Adhar no");
p2.add(l3);
t2=new TextField(20);
p2.add(t2);


l4=new Label("Mobile  no");
p2.add(l4);
t3=new TextField(20);
p2.add(t3);


l5=new Label("Date of Birth");
p2.add(l5);
t4=new TextField(20);
p2.add(t4);

l6=new Label("Adress");
p2.add(l6);
t5=new TextField(20);
p2.add(t5);

l7=new Label("Catagory");
p2.add(l7);
cat=new Choice();
cat.add("SC");
cat.add("ST");
cat.add("OBC");
p2.add(cat);

l8=new Label("Cast");
p2.add(l8);
t6=new TextField(20);
p2.add(t6);

b1=new Button("OK");
p2.add(b1);

b2=new Button("CLEAR");
p2.add(b2);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});

b1.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s2.setVisible(true);
s1.setVisible(false);
}
});


b2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
t1.setText(" ");
t2.setText(" ");
t3.setText(" ");
t4.setText(" ");
t5.setText(" ");
t6.setText(" ");
}
});
}

public static void main(String[] args)
{
s1=new sap1();
s1.setVisible(true);
s1.setSize(300,300);
}




class sap2 extends Frame
{
public Label c,co,y,pq,ad,f;
public TextField d,fe;
public Choice ch,com,ye;
public Checkbox p,i,di;
public Button ba,su,cl;

public  sap2()
{
Panel p4=new Panel();
p4.setBackground(Color.CYAN);

add(p4);
p4.setLayout(new GridLayout(10,2));
c=new Label("Cource");
p4.add(c);
ch=new Choice();
ch.add("BCOM");
ch.add("BSC");
ch.add("BCA");
p4.add(ch);
co=new Label("Combination");
p4.add(co);
com=new Choice();
com.add("PCM");
com.add("PMCS");
com.add("CBZ");
p4.add(com);

y=new Label("Year");
p4.add(y);
ye=new Choice();
ye.add("1");
ye.add("2");
ye.add("3");
p4.add(ye);

pq=new Label("Privois Qalification");
p4.add(pq);
p=new Checkbox("PUC");
i=new Checkbox("ITI");
di=new Checkbox("DIP");
p4.add(p);
p4.add(i);
p4.add(di);

ad=new Label("Admission date");
p4.add(ad);

d=new TextField(50);
p4.add(d);
f=new Label("Fees");
p4.add(f);

fe=new TextField(30);
p4.add(fe);

ba=new Button("BACK");
p4.add(ba);

su=new Button("SUBMIT");
p4.add(su);

cl=new Button("CLEAR");
p4.add(cl);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
ba.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s2.setVisible(false);
s1.setVisible(true);
}
});

su.addActionListener(new ActionListener()
{
public  void  actionPerformed(ActionEvent ae)
{
s3.setVisible(true);
s2.setVisible(false);
}
});
cl.addActionListener(new ActionListener()
{
public void  actionPerformed(ActionEvent ae)
{
d.setText("");
fe.setText("");
}
});
}
}

class sap3 extends Frame
{
public  Label x;
public Button bk;

public sap3()
{
setLayout(new FlowLayout());
x=new Label("Admission  Details");
add(x);
bk=new Button("BACKK");
add(bk);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
bk.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent ae)
{
s3.setVisible(false);
s2.setVisible(false);
s1.setVisible(true);
}
});
}


public void paint(Graphics g)
{
g.drawString("Name : "+s1.t1.getText(),10,20);
g.drawString("Adhar no : "+s1.t2.getText(),10,30);
g.drawString("mobile no : "+s1.t3.getText(),10,40);
g.drawString("date of birth : "+s1.t4.getText(),10,50);
g.drawString("catagory : "+s1.t5.getText(),10,60);
g.drawString("Cast : "+s1.t6.getText(),10,70);
g.drawString("Cource : "+s2.ch.getSelectedItem(),10,80);
g.drawString("Combination : "+s2.com.getSelectedItem(),10,90);
g.drawString("Year : "+s2.ye.getSelectedItem(),10,100);

String cource="";
if(s2.p.getState())
{
cource+="PUC";
}
else
if(s2.i.getState())
{
cource+="ITI";
}
else
if(s2.di.getState())
{
cource+="Diplamo";
}
g.drawString("previous Cource"+cource,10,120);
g.drawString("addmission date:"+s2.d.getText(),10,140);
g.drawString("Fess : "+s2.fe.getText(),10,160);
g. drawArc(30,50,20,20,200,200);
}
}
}