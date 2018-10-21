package testecl;


import org.junit.Test;

public class BusTest {
	@Test
	public void testDrive()
	{
	
		Bus firstBus = new Bus("T", 50, 24);
		firstBus.openDoors();
		firstBus.setBrand("D");
		firstBus.setNumberOfSeats(20);
		System.out.println(firstBus.getBrand());
		
	
		int a=6;
	
		System.out.println(a);
		Bus secondBus = new Bus();
		secondBus.setBrand("F");
		secondBus.openDoors();
		secondBus.setNumberOfSeats(30);
		System.out.println(secondBus.getBrand());
	
		firstBus.sayHello();
		
	
	}
}
