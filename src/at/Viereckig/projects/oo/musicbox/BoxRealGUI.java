package at.Viereckig.projects.oo.musicbox;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BoxRealGUI extends JFrame implements ActionListener{
	
	private Box box;
	public BoxRealGUI(Box box) {
	
		this.box = box;
	}
	
	
	
	public void boxrealgui() {
		JFrame  frame = new JFrame();
		frame.setTitle("Musicbox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500, 500);
	    frame.setLocation(430, 100);
		frame.setVisible(true);
	
		
		JPanel panel = new JPanel();

	    frame.add(panel);

	    JLabel lbl = new JLabel("Wählen Sie aus was für eine Action Sie tätigen wollen!");

	    panel.add(lbl);
	    

	    String[] choices = { "Zeigt alle Platten", "Legt Platte ein", "Wirft Platte wieder aus", "Suche Record mit Titel",
	                         "spiele Titel ab", "zeigt aktuell eingelegte Platte", "zeigt summe aller Titel" };

	    final JComboBox<String> cb = new JComboBox<String>(choices);

	    cb.setMaximumSize(cb.getPreferredSize());
	    panel.add(cb);

	    JButton btn = new JButton("Ausführen");
	    panel.add(btn);

	    frame.setVisible(true);
	    
	    
	    
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
