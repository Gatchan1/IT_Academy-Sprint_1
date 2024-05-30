package n1exercici1;

public class InstrumentWind extends Instrument {
	public InstrumentWind(String name, double price) {
		super(name, price);
	}

	public void play() {
		System.out.println("Està sonant un instrument de vent");
	}
}
