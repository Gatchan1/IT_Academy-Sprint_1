package n3exercici1;

import java.util.Iterator;
import java.util.Scanner;

public class Cinema {
	private static Scanner sc = new Scanner(System.in);

	private int numberRows;
	private int seatsPerRow;
	private SeatsManagement seatsManagement;

	public Cinema() {
		seatsManagement = new SeatsManagement();
		requestInitialData();
	}

	public void start() {
		boolean sortir = false;
		do {
			switch (menu()) {
			case 1:
				showSeats();
				break;
			case 2:
				showSeatsClient();
				break;
			case 3:
				bookSeat();
				break;
			case 4:
				cancelSeat();
				break;
			case 5:
				cancelSeatsClient();
				break;
			case 0:
				System.out.println("Gracias por utilizar la aplicación.");
				sortir = true;
				break;
			}
		} while (!sortir);
	}

	private byte menu() {
		byte option;
		do {
			System.out.println("\nEscoja la opción deseada: "
					+ "\n1. Mostrar todas las butacas reservadas."
					+ "\n2. Mostrar todas las butacas reservadas por una persona."
					+ "\n3. Reservar una butaca."
					+ "\n4. Anular la reserva de una butaca."
					+ "\n5. Anular todas las reservas de una persona."
					+ "\n0. Salir de la aplicación.");
			option = sc.nextByte();
			sc.nextLine();
			if (option < 0 || option > 5) {
				System.out.println("Escoja una opción válida");
			}
		} while (option < 0 || option > 5);
		return option;
	}

	private void requestInitialData() {
		System.out.println("Introduce el número de filas:");
		numberRows = sc.nextInt();
		System.out.println("Introduce el número de asientos por fila:");
		seatsPerRow = sc.nextInt();
		sc.nextLine();
	}

	private void showSeats() {
		if (seatsManagement.getSeats().size() == 0) {
			System.out.println("No hay ninguna butaca reservada.");
		} else {
			for (Seat seat : seatsManagement.getSeats()) {
				System.out.println(seat);
			}			
		}
	}

	private void showSeatsClient() {
		System.out.println("Introduce el nombre de la persona que hizo la reserva:");
		String clientName = sc.nextLine();
		int results = 0;
		for (Seat seat : seatsManagement.getSeats()) {
			if (clientName.equalsIgnoreCase(seat.getClientName())) {
				System.out.println(seat);
				results++;
			}
		}
		if (results == 0) {
			System.out.println("No hay ninguna butaca reservada a nombre de esta persona.");
		}
	}

	private void bookSeat() {
		try {
			int rowNum = enterRow();
			int seatNum = enterSeatNumber();
			String clientName = enterClientName();
			seatsManagement.addSeat(new Seat(rowNum, seatNum, clientName));
		} catch (ExceptionWrongRow | ExceptionWrongSeat | ExceptionWrongClientName e) {
			System.out.println(e.getMessage());
		}
	}

	private String enterClientName() throws ExceptionWrongClientName {
		System.out.println("Introduce el nombre del cliente:");
		String clientName = sc.nextLine();
		if (clientName.matches(".*[0-9].*")) {
			throw new ExceptionWrongClientName("El nombre no puede contener números.");
		} else {
			return clientName;
		}
	}

	private int enterRow() throws ExceptionWrongRow {
		System.out.println("Introduce el número de fila:");
		int rowNum = sc.nextInt();
		sc.nextLine();
		if (rowNum >= 1 && rowNum <= numberRows) {
			return rowNum;
		} else {
			throw new ExceptionWrongRow("El número de fila introducido no existe.");
		}
	}

	private int enterSeatNumber() throws ExceptionWrongSeat {
		System.out.println("Introduce el número de asiento:");
		int seatNum = sc.nextInt();
		sc.nextLine();
		if (seatNum >= 1 && seatNum <= seatsPerRow) {
			return seatNum;
		} else {
			throw new ExceptionWrongSeat("El número de asiento introducido no existe.");
		}
	}

	private void cancelSeat() {
		try {
			int rowNum = enterRow();
			int seatNum = enterSeatNumber();
			seatsManagement.clearSeat(rowNum, seatNum);
		} catch (ExceptionWrongRow | ExceptionWrongSeat e) {
			System.out.println(e.getMessage());
		}
	}

	private void cancelSeatsClient() {
		try {
			String clientName = enterClientName();
			boolean success = false;
			Iterator<Seat> seatsIt = seatsManagement.getSeats().iterator();
			while(seatsIt.hasNext()) {
				Seat seat = seatsIt.next();
				if (clientName.equalsIgnoreCase(seat.getClientName())) {
					seatsIt.remove();
					success = true;
				}
			}
			if (success) {
				System.out.println("Reservas eliminadas satisfactoriamente");
			} else {
				System.out.println("No se ha encontrado ninguna reserva a nombre de dicho cliente.");
			}
		} catch (ExceptionWrongClientName e) {
			System.out.println(e.getMessage());
		}
	}

}
