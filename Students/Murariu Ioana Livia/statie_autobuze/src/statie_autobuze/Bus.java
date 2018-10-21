/*
 * Author: Murariu Ioana-Livia
 * Group: 30423
 * Date: 21-10-2018
 */

package statie_autobuze;

public class Bus {
	private String brand;
	private int numberOfSeats;
	private int busNumber;

	public Bus() {

	}
	
	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public Bus(String brand) {
		this.brand = brand;
	}

	public Bus(String brand, int numberOfSeats) {
		this.brand = brand;
		this.numberOfSeats = numberOfSeats;
	}
	
	public Bus(String brand, int numberOfSeats, int busNumber) {
		this.brand = brand;
		this.numberOfSeats = numberOfSeats;
		this.busNumber = busNumber;
	}

	public void openDoors() {
		System.out.println("I'm opening my doors");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
}
