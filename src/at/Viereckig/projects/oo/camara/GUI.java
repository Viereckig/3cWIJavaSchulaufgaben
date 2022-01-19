package at.Viereckig.projects.oo.camara;

public class GUI {
	private Kamera camara;
	
	
	
	
	public GUI(Kamera camara) {
		this.camara = camara;
		
	}
	
	public void run() {
		this.camara.doFoto();
		camara.setSetting("mittel");
		this.camara.doFoto();
		camara.setSetting("groﬂ");
		this.camara.doFoto();
		System.out.println(camara.getSdcard().checkcapacy());
	}
	
	
	
}
