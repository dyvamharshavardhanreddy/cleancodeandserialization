package epam.cleancode_serialization;

import java.io.IOException;

public class App 
{
	static {
		System.out.format("%s","enter your specifications\nA.select material Standard:\n\t1.standard material"
				+ "\n\t2.above standard material\n\t3.high standard material\n\t4.high standard with fully automated\n");
		System.out.format("%s","B.total area of house in squarefeet.\n");
		SpecificationsOfHouse house = new SpecificationsOfHouse();
		house.input();
		try {
			house.costCalculation();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public static void main( String[] args )
    {
        
    }
}
