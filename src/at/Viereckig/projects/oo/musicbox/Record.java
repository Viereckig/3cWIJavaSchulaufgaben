package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;

public class Record {
	ArrayList<Title> titles = new ArrayList<Title>();
	private String name;
	
	public Record(String name) {
		this.name = name;
	}
	
	
	
	public void addTitle(Title titles) {
		this.titles.add(titles);
	}
	
	
	public String getTitels(int titelnummber) {
		Title test = titles.get(titelnummber);
		return test.getName();
	
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
