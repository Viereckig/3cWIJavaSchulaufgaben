package at.Viereckig.projects.oo.musicbox;

import java.util.ArrayList;

public class Record {
	ArrayList<Title> titles;
	private String name;
	
	public Record(String name) {
		this.titles =  new ArrayList<>();
	}
	
	
	
	public void addTitle(Title titles) {
		this.titles.add(titles);
	}
	
	
	public String getTitels(int titelnummber) {
		Title test = titles.get(titelnummber);
		return test.getName();
	}
	
	public String getRecord(Title title) {
		
		return name;
	}
	
	
	
}
