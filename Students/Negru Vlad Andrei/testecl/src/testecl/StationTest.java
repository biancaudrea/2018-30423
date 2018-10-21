package testecl;

import org.junit.Test;

public class StationTest {
	@Test
	public void stationTest() {
		Station myStation = new Station("Beta", 2);
		Bus currentBus = new Bus("Mercedes", 75, 13);
		myStation.addBus(currentBus);
		currentBus = new Bus("Volkswagen", 45, 20);
		myStation.addBus(currentBus);
		
		currentBus = new Bus("Renault", 80, 3);
		myStation.addBus(currentBus);
		myStation.printBusses();
		myStation.takeBusOut(10);
		myStation.printBusses();
		
		
	}
}
