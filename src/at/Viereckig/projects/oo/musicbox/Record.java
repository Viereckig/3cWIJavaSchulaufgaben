package at.Viereckig.projects.oo.musicbox;

import java.util.List;

public class Record {
	private List<Title> titles;
	private String name;
	
	public Record(String name) {
		this.name = name;
	}
	
	
	
	public void addTitle(Title titles) {
		this.titles.add(titles);
	}
	
	
	public List<Title> getTitels() {
		return titles;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
