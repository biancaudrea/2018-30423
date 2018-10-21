package testecl;

public class Bus {
	//ENCAPSULATION
	private String brand = "MERCEDES";
	private int numberOfSeats; // attributes
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Bus() {
		this.brand = null;
		this.numberOfSeats = 0;
	}
	
	public Bus(String brand, int numberOfSeats, int number) {
		this.brand = brand;
		this.numberOfSeats = numberOfSeats;
		this.number = number;
	}
	
	
	// Behavior
	public void openDoors() {
		System.out.println("I'm opening my doors.");
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
	public void sayHello()
	{
		System.out.println("I'm bus number "+number+", brand "+brand);
	}
	@Override
	public String toString()
	{
		return "Brand:"+this.brand+", number of seats:"+this.numberOfSeats+", bus number:"+this.number;
	}
}
