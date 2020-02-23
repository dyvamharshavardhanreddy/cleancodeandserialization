package epam.cleancode;
import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class SimpleIntrest {
	Scanner scanner=new Scanner(System.in);
	public void si() throws IOException {
		float principleAmount= scanner.nextFloat();
		float timeInYears= scanner.nextFloat();
		float ratePerAnnum= scanner.nextFloat();
		float simpleIntrest=(principleAmount*timeInYears*ratePerAnnum)/100f;
		principleAmount=principleAmount+simpleIntrest;
		OutputStreamWriter writer = new OutputStreamWriter(System.out);
		writer.write("Simple Intrest = "+simpleIntrest);
		//System.out.format("%s","\n");
		writer.write("\nReturn amount = "+principleAmount);
		writer.flush();
	}
}