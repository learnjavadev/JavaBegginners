import java.io.DataInputStream;
import java.io.IOException;

public class DataInputSteamExample {

	public static void main(String[] args) throws IOException  {
		
		System.out.println("Please enter your data");
		System.out.println("Please enter name:");
		
		DataInputStream dis = new DataInputStream(System.in);
		String name = dis.readLine();
		
		System.out.println("Please enter age:");
		int age = dis.readInt();
		
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
		
		
	}
}
