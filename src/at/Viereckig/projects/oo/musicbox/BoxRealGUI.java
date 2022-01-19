package at.Viereckig.projects.oo.musicbox;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BoxRealGUI extends JFrame implements ActionListener{
	private Box box;
	JButton btn;
	JComboBox cb;
	JTextField tfName;
	int choice = 0;
	String input;
	
	
	
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
	    

	    String[] choices = {"Aktions auswahl", "Zeigt alle Platten", "Legt Platte ein", "Wirft Platte wieder aus", "Suche Record mit Titel",
	                         "spiele Titel ab", "zeigt aktuell eingelegte Platte", "zeigt summe aller Titel" };

	    cb = new JComboBox(choices);
	    cb.addActionListener(this);
	    cb.setMaximumSize(cb.getPreferredSize());
	    panel.add(cb);
	    
	    

	    btn = new JButton("Ausführen");
	    btn.addActionListener(this);
	    panel.add(btn);
	    

	    tfName = new JTextField(15);
	    tfName.addActionListener(this);
	    panel.add(tfName);
	    
	    
	    
	    frame.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Magazin magazin = this.box.getMagazin();
		
		if(e.getSource()==cb) {
			choice = cb.getSelectedIndex();
		}
		
	
		
		if(e.getSource()==btn) {
			input = tfName.getText();
			
			if(input != null) {
				switch (choice){
					case 1:
						for(Record record : magazin.getRecords()) {
							System.out.println(record.getName());
						}
						break;
					case 2:
						magazin.loadRecord(magazin.getRecords().get(Integer.parseInt(input)));
						System.out.println("Platte wurde erfolgreich Eingelegt!");
						break;
					case 3:
						magazin.unloadRecord();
						System.out.println("Platte wurde erfolgreich Entladen!");
						break;
					case 4:
						
						List<Record> find = new ArrayList();
						find = magazin.findrecord(input);
						for (int i = 0; i<find.size(); i++) {
							System.out.println(find.get(i).getName());
						}
						
						break;
					case 5:
						magazin.play(Integer.parseInt(input));
						break;
					case 6:
						if(magazin.getRecordin() != null)
							System.out.println("Es ist gerade "+ magazin.getRecordin().getName() + " eingelegt!");
						else
							System.out.println("Es ist keine Platte eingelegt!");
						break;
					case 7:
						System.out.println("Es sind insgesamt " + box.getSumOfMusic()+ " Minuten!");
						break;
				}
			}else
				System.out.println("Der Input wurde leergelassen!");
		}
	}
}
