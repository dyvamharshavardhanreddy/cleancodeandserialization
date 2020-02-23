package epam.cleancode;
import java.util.Scanner;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class CompoundIntrest {
	Scanner scanner=new Scanner(System.in);
	public void ci() throws IOException{
		float compoundIntrest = 0;
		float principleAmount= scanner.nextFloat();
		float timeInYears= scanner.nextFloat();
		float ratePerAnnum= scanner.nextFloat();
			for(int i=1;i<=timeInYears;i++) {
				compoundIntrest=(principleAmount*ratePerAnnum)/100f;
				principleAmount=principleAmount+compoundIntrest;
			}
			OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
		    streamWriter.write("compound Intrest = "+ compoundIntrest);
		    //System.out.format("%s","\n");
		    streamWriter.write("\nReturn amount = "+ principleAmount);
		    streamWriter.flush();
	}
}
