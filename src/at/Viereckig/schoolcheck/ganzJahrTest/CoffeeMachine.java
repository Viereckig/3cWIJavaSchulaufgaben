package at.Viereckig.schoolcheck.ganzJahrTest;

public class CoffeeMachine {
	String name;
	Boolean energyStatus = false;
	int size = 40;
	int strengh = 1;
	
	WaterTank waterTank;
	BeanStorage beanStorage;
	
	
	public CoffeeMachine(String name, WaterTank waterTank, BeanStorage beanStorage) {
		this.name = name;
		this.waterTank = waterTank;
		this.beanStorage = beanStorage;
	}

	
	public int getSize() {
		return size;
	}

	public int getStrengh() {
		return strengh;
	}

	public void setSize(int size) {
		if (size >= 40 && size <= 200) {
			this.size = size;
		} else {
			System.out.println("Geben Sie Bitte einen Wert von 40ml bis 200ml ein!");
		}
	}


	public void setStrengh(int strengh) {
		if (size >= 1 && size <= 10) {
			this.strengh = strengh;
		} else {
			System.out.println("Geben Sie Bitte einen Wert von 1 bis 10 ein!");
		}
	}

	public void getCoffee() {
		if(energyStatus == true) {
			if(waterTank.getCapacy() >= size) {
				if(beanStorage.getCapacy() >= strengh*10) {
					beanStorage.shortCapacy(strengh);
					waterTank.shortCapacy(size);
					System.out.println("Hier Ihr Kaffee ist fertig!");
				}else {
					System.out.println("Es sind nicht genug Bohnen in der Maschine! Bitte Nachfüllen!");
				}
			}else {
				System.out.println("Es ist nicht genug Wasser in der Maschine! Bitte Nachfüllen!");
			}
			
		
		}else {
			System.out.println("Die Kaffee Maschine ist aus!");
		}
	}


	public void turnOn() {
		if(energyStatus == true) {
			System.out.println("Die Kaffeemaschine ist schon Eingeschalten!");
		}else {
			energyStatus = true;
		}
	}
	
	public void turnOff() {
		if(energyStatus == false) {
			System.out.println("Die Kaffeemaschine ist schon Ausgeschalten!");
		}else {
			energyStatus = false;
		}
	}
	
}
