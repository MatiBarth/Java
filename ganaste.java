import javax.swing.*;
import java.awt.*;

public class ganaste extends JFrame {
	private JLabel label;
	public ganaste(){
		setLayout(null);
		label=new JLabel("GANASTEEEE!!!");
		label.setBounds(50,30,100,20);
		label.setForeground(Color.red);
		label.setBackground(Color.black);
		add(label);
	}

}
