package n1exercici1;

public class InstrumentPercussion extends Instrument {
	public InstrumentPercussion(String name, double price) {
		super(name, price);
	}

	public void play( ) {
		System.out.println("Està sonant un instrument de percussió");
	}
}
