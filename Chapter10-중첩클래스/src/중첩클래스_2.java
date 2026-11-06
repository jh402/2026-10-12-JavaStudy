import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class 중첩클래스_2 extends JFrame implements ActionListener{
    JButton b1,b2;
    JProgressBar[] bar=new JProgressBar[5];
    
    class BarThread extends Thread {
		public void run() {
			go();
		}
	}
	public 중첩클래스_2() {
    	b1=new JButton("시작");
    	b2=new JButton("종료");
    	Color[] colors={
    		Color.cyan,
    		Color.yellow,
    		Color.pink,
    		Color.orange,
    		Color.magenta
    	};
    	JPanel p=new JPanel();
    	p.setLayout(new GridLayout(5,1,5,5));
    	for(int i=0;i<bar.length;i++) {
    		bar[i]=new JProgressBar();
    		bar[i].setMinimum(0);
    		bar[i].setMaximum(100);
    		bar[i].setBackground(Color.white);
    		bar[i].setForeground(colors[i]);
    		bar[i].setStringPainted(true);
    		p.add(bar[i]);
    	}
    	JPanel p1=new JPanel();
    	p1.add(b1); p1.add(b2);
    	add("Center",p);
    	add("South",p1);
    	setSize(450, 350);
    	setVisible(true);
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    }
    public void go() {
    	for(int i=0;i<bar.length;i++) {
    		for(int j=0;j<=100;j++) {
    			bar[i].setValue(j);
        		try {
        			Thread.sleep(100);
        		}catch(Exception e) {}
    		}
    	}
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			BarThread b=new BarThread();
			b.start();
		}
		if(e.getSource()==b2) {
			System.exit(0);
		}
	}
    public static void main(String[] args) {
	    new 중첩클래스_2();
	}
}