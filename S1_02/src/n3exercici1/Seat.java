package n3exercici1;

import java.util.Objects;

public class Seat {
	private int row;
	private int seatNumber;
	private String clientName;
	
	public Seat(int row, int seatNumber, String clientName) {
		this.row = row;
		this.seatNumber = seatNumber;
		this.clientName = clientName;
	}

	public int getRow() {
		return row;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public String getClientName() {
		return clientName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(seatNumber, row);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return seatNumber == other.seatNumber && row == other.row;
	}

	@Override
	public String toString() {
		return "Row: " + row + ", Seat number: " + seatNumber + ", Client Name: " + clientName;
	}
	
}
