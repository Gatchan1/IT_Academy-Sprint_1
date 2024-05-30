package n1exercici1;

public class N1Exercici1 {
	public static void main(String[] args) {
		InstrumentWind trumpet = new InstrumentWind("Startone PTR-20 Trumpet", 99.50);
		InstrumentString violin = new InstrumentString("Thomann Student Violin", 139);
		InstrumentPercussion drum = new InstrumentPercussion("Yamaha Stage Custom Drum", 171);
		
		trumpet.play();
		violin.play();
		drum.play();
	}
}
