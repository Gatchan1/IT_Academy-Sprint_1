package n3exercici1;

import java.util.ArrayList;

public class SeatsManagement {
	private ArrayList<Seat> seats;

	public SeatsManagement() {
		seats = new ArrayList<Seat>();
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void addSeat(Seat seat) {
		try {
			if (searchSeat(seat.getRow(), seat.getSeatNumber()) >= 0) {
				throw new ExceptionTakenSeat("El asiento seleccionado no se encuentra disponible.");
			}
			seats.add(seat);
			System.out.println("Butaca reservada satisfactoriamente.");
		} catch (ExceptionTakenSeat e) {
			System.out.println(e.getMessage());
		}
	}

	public void clearSeat(int row, int seatNumber) {
		try {
			int foundSeatIndex = searchSeat(row, seatNumber);
			if (foundSeatIndex < 0) {
				throw new ExceptionEmptySeat("El asiento seleccionado no se encuentra ocupado.");
			}
			seats.remove(foundSeatIndex);
			System.out.println("Reserva eliminada satisfactoriamente.");
		} catch (ExceptionEmptySeat e) {
			System.out.println(e.getMessage());
		}
	}

	private int searchSeat(int row, int seatNumber) {
		int seatIndex = -1;
		Seat searchedSeat = new Seat(row, seatNumber, "");
		for (int i = 0; i < seats.size() && seatIndex < 0; i++) {
			if (searchedSeat.equals(seats.get(i))) {
				seatIndex = i;
			}
		}
		return seatIndex;
	}
}
