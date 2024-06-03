package n1exercici1;

public class InstrumentString extends Instrument {
	public InstrumentString(String name, double price) {
		super(name, price);
	}

	@Override
	public void play( ) {
		System.out.println("Està sonant un instrument de corda");
	}
}
