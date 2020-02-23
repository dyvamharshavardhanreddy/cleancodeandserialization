package epam.cleancode_serialization;
import java.util.*;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class SpecificationsOfHouse   {
	public int materialStandard;
	public float totalAreaOfHouse;
	public float cost;
	public void input() {
		Scanner scanner=new Scanner(System.in);
		materialStandard = scanner.nextInt();
		totalAreaOfHouse = scanner.nextFloat();
		scanner.close();
	}
	public void costCalculation() throws IOException {
		if(materialStandard== 1) {
			float cost = totalAreaOfHouse*1200;
			OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		    streamWriter.write("construction cost = "+ cost);
		    streamWriter.flush();
		}
		else if(materialStandard==2) {
				float cost = totalAreaOfHouse*1500;
				OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
			    streamWriter.write("construction cost = "+ cost);
			    streamWriter.flush();
		}
		else if(materialStandard==3) {
			float cost = totalAreaOfHouse*1800;
			OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		    streamWriter.write("construction cost = "+ cost);
		    streamWriter.flush();
		}
		else if(materialStandard==4) {
			float cost = totalAreaOfHouse*2500;
			OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		    streamWriter.write("construction cost = "+ cost);
		    streamWriter.flush();
		}
		else {
			System.err.print("\ninvalid data");
		}
		
	}
}
