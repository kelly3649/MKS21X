import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("My first GUI");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton bCtoF = new JButton("CtoF");
	bCtoF.addActionListener(this);
	bCtoF.setActionCommand("CeltoFah");

	t = new JTextField(10);

	JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("Meaning of life is... ");
	pane.add(c);
	pane.add(t);
       	pane.add(bCtoF);
	pane.add(j);
    }
    public static double CtoF(double t){
	return t * 9 / 5 + 32;
    }
    public static double FtoC(double t){
	return (t-32) * 5 / 9;
    }
    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	if(event.equals("CeltoFah")){
	    String s = t.getText();
	    double val = Integer.parseInt(s);
	    String retVal = String.valueOf(CtoF(val));
	    j.setText(retVal);
	}
	if(event.equals("NotByte")){
	    j.setText("Fish");
  
	}
    }
}

