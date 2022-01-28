package at.Viereckig.schoolcheck.semestertest;

public class GUI {
	private Lamp lamp;
	public GUI(Lamp lamp) {
		this.lamp = lamp;
	
		
	}
	
	void run() {
		// TODO Auto-generated method stub
		GlowElements glow1 = new GlowElements("LED 1", "Grün");
		GlowElements glow2 = new GlowElements("LED 2", "Gelb");
		GlowElements glow3 = new GlowElements("LED speziell", "Rot");
		lamp.addglowelement(glow1);
		lamp.addglowelement(glow2);
		lamp.addglowelement(glow3);
		
		lamp.turnallOn();
		lamp.turnallOff();
		lamp.turnallOn();
		lamp.turnallOn();
		
		System.out.println(lamp.getOverallPowerUsage());
		
		lamp.printNamesOfLightElements();
	
	}
	

}
