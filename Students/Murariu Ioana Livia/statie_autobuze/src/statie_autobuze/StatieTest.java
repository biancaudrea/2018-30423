package statie_autobuze;

import org.junit.Test;

public class StatieTest {
	@Test
	public void testDrive() {
		Bus firstBus = new Bus("M", 50, 25);
		Bus secondBus = new Bus("M", 25, 3);
		Bus thirdBus = new Bus("T", 13, 46);
		Bus fourthBus = new Bus("D", 25, 35);

		Statie firstStation = new Statie();
		Statie secondStation = new Statie();

		firstStation.setStationName("G");
		secondStation.setStationName("C");

		firstStation.busesReceived[1] = firstBus;
		firstStation.busesReceived[2] = secondBus;

		secondStation.busesReceived[1] = thirdBus;
		secondStation.busesReceived[2] = fourthBus;

		Statie.receivedBus(firstStation.stationName, firstStation.busesReceived[1].getBusNumber());
		Statie.receivedBus(secondStation.stationName, secondStation.busesReceived[2].getBusNumber());

	}

}
