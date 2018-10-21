package statie_autobuze;

public class Statie {

	public Bus[] busesReceived=new Bus[10];
	public String stationName;

	// Bus received

	public Bus[] getBusesReceived() {
		return busesReceived;
	}

	public void setBusesReceived(Bus[] busesReceived) {
		this.busesReceived = busesReceived;
	}

	// Station name
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public Statie(String stationName, Bus busesReceived[]) {
		this.stationName = stationName;
		this.busesReceived = busesReceived;

	}

	// station assignment
	public Statie() {
	}

	public Statie(String stationName) {
		this.stationName = stationName;
	}
	
	public static void receivedBus(String stationName,int busNumber)
	{
		System.out.println(stationName+" received bus "+busNumber);
	}
}
