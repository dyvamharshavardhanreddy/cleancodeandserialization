package epam.cleancode;
import java.io.IOException;
import java.util.Scanner;
public class App
{
	static {
		System.out.format("%s","enter 'simpleintrest or compoundintrest' for calculating simple intrest or compound intrest\n");
		Scanner scanner=new Scanner(System.in);
		String ch=scanner.next();
		switch(ch) {
		case "simpleintrest":
			SimpleIntrest o1=new SimpleIntrest();
        	try {
				o1.si();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		case "compoundintrest":
			CompoundIntrest o2=new CompoundIntrest();
			try {
				o2.ci();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	scanner.close();
	}
    public static void main( String[] args )
    {
    		
    }
}
