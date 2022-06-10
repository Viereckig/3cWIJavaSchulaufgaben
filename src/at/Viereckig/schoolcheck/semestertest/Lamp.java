package at.Viereckig.schoolcheck.semestertest;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
	private List<GlowElements> GlowElements;
	
	public Lamp() {
		this.GlowElements = new ArrayList<>();
	}
	
	public void addGlowElement(GlowElements element) {
		this.GlowElements.add(element);
	}
	
	public void turnAllOn() {
		for (int i = 0; i < this.GlowElements.size(); i++) {
			this.GlowElements.get(i).turnon();
		}
	}
	
	public void turnAllOff() {
		for (int i = 0; i < this.GlowElements.size(); i++) {
			this.GlowElements.get(i).turnoff();
		}
	}
	
	public int getOverallPowerUsage() {
		int powerusage = 0;
		for (int i = 0; i < this.GlowElements.size(); i++) {
			powerusage = powerusage + this.GlowElements.get(i).getPowerconsumption();
		}
		return powerusage;
	}
	
	
	public void printNamesOfLightElements() {
		for (int i = 0; i < this.GlowElements.size(); i++) {
			System.out.println(this.GlowElements.get(i).getName());
		}
		
	}
	
}
