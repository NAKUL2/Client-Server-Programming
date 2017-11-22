import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {
		String message,tmp;
		
		Scanner in = new Scanner(System.in);

		Socket socket = new Socket("127.0.0.1",1234);
		Scanner in_2 = new Scanner(socket.getInputStream());
		
		System.out.println("Enter your Message ");
		message = in.nextLine();
		
		PrintStream print = new PrintStream(socket.getOutputStream());
		print.println(message);
		
		tmp = in_2.nextLine();
		System.out.println(tmp);


	}

}
