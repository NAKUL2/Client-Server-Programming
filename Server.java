import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws IOException {
		String message,tmp;
		
		ServerSocket s_socket = new ServerSocket(1234);
		Socket socket = s_socket.accept();
		
		Scanner in = new Scanner(socket.getInputStream());
		message = in.nextLine();
		
		if(!message.isEmpty()){
			tmp = "Message Sent Successful";
		}
		else{
			tmp = "Falled";
		}
		
		PrintStream  print = new PrintStream(socket.getOutputStream());
		print.println(tmp);
		

	}

}
