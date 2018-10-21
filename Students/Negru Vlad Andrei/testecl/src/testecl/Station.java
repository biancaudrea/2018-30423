package testecl;

public class Station {
	private Bus[] busses; // github.com/OOPCLASS
	private String name;
	private int maxLen; // maximum capacity of station
	private int bussesInStation = 0;

	// constructs Station
	public Station(String name, int maxLen) {
		this.name = name;
		this.maxLen = maxLen;
		this.busses = new Bus[maxLen];
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// adds a bus to the station. If station is full, returns false. If the bus was
	// added successfully return true.
	public boolean addBus(Bus newBus) {
		if (this.isFull() == true) {
			System.out.println("Failed to add new bus to the station. Station is full.");
			return false;

		}

		this.busses[this.bussesInStation++] = newBus;
		return true;
	}

	public int getBussesInStation() {
		return this.bussesInStation;
	}
	//returns true if station is empty
	public boolean isEmpty() {
		if (this.bussesInStation == 0)
			return true;
		else
			return false;
	}
	//returns true if station is full
	public boolean isFull() {
		if (this.bussesInStation == this.maxLen)
			return true;
		else
			return false;
	}
	//takes out the bus targetBus from the Station.
	public boolean takeBusOut(Bus targetBus) {
		int targetPos = -1;
		for (int i = 0; i < this.bussesInStation && targetPos == -1; i++) {
			if (targetBus == this.busses[i]) {
				targetPos = i;
			}
		}
		if (targetPos == -1) {
			System.out.println(targetBus.getNumber() + " not found in the station.");
			return false; // bus not found
		}

		System.out.println(this.busses[targetPos].getNumber() + " is exiting the station.");
		for (; targetPos < this.bussesInStation; targetPos++) {
			this.busses[targetPos] = this.busses[targetPos + 1];
		}
		this.bussesInStation--;
		return true;
	}

	//print the busses from station
	public void printBusses() {
		if (this.isEmpty() == true)
			System.out.println("Station is empty.");
		else {
			for (int i = 0; i < this.bussesInStation; i++) {
				System.out.println("Bus number " + (i + 1) + ": " + busses[i].toString());
			}
		}
	}
	//takes out the bus with number 'number'.Overrides the first method of taking out a bus.
	public boolean takeBusOut(int number) {

		for (int i = 0; i < this.bussesInStation; i++) {
			if (this.busses[i].getNumber() == number) {
				return this.takeBusOut(this.busses[i]);
			}
		}
		System.out.println(number + " not found in the station.");
		return false;
	}

}
