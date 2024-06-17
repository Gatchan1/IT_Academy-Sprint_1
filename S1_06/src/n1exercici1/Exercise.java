package n1exercici1;

public class Exercise {

	public static void main(String[] args) {
		NoGenericMethods example = new NoGenericMethods("hola", "que", "tal");
		System.out.println(example.getItem1());
		System.out.println(example.getItem2());
		System.out.println(example.getItem3());
		
		NoGenericMethods example2 = new NoGenericMethods("que", "tal", "hola");
		System.out.println("\n"+ example2.getItem1());
		System.out.println(example2.getItem2());
		System.out.println(example2.getItem3());
	}

}
