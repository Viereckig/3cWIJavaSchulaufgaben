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
		lamp.addGlowElement(glow1);
		lamp.addGlowElement(glow2);
		lamp.addGlowElement(glow3);
		
		lamp.turnAllOn();
		lamp.turnAllOff();
		lamp.turnAllOn();
		lamp.turnAllOn();
		
		System.out.println(lamp.getOverallPowerUsage());
		
		lamp.printNamesOfLightElements();
	
	}
	

}
