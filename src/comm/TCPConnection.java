package comm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPConnection extends Thread {

	public OnMessageListener listener;
	private Socket socket;
	private int puerto;
	private String entrada;
	
	public void setEntrada(String msj) {
		this.entrada = msj;
	}
	
	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Mandado a servidor");
			Socket socket = new Socket(entrada,puerto);
			System.out.println("Conectado");
			
			OutputStream out = socket.getOutputStream();
			BufferedWriter bwritter = new BufferedWriter(new OutputStreamWriter(out));
			
			InputStream is = socket.getInputStream();
			BufferedReader breader = new BufferedReader(new InputStreamReader(is));
			
			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				
				System.out.println("Escriba un mensaje al servidor");
				String line = scan.nextLine() + "\n";
				long a = 0;
				long a1 = 0;
				String m = "RTT" + "\n";
				String m1 = "Speed" + "\n";
				if(m.equalsIgnoreCase(line)) {
					a = System.nanoTime();
					String _1024Bytes = "sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd";
					bwritter.write(_1024Bytes + "\n");
					bwritter.flush();
					
				}else if(line.equalsIgnoreCase(m1)) {
					a1 = System.nanoTime();
					String _8192Bytes = "sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fd sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfs sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds afdfssdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf fdsafdfafdsfsdaf dfsafdfsdadfdsafsdfdsafasd dsafsdafs fsdafdsaf fdasf fsda fdsfsfs dsafdsafdafds sdfsfdsfsda fdsafdsaf dsafdsaf sadfasfsd fasdfsdf asdaasdasdasdasdasd2eqweqweqeqwe asdasd asdasdasd dasdasdad";
					bwritter.write(_8192Bytes + "\n");
					bwritter.flush();
				}else {
					
				bwritter.write(line);
				bwritter.flush();
				
				}
				
				String msj = breader.readLine();

				if(msj.getBytes().length == 1024) {
					long b = System.nanoTime();
					long c = b - a;
					listener.onMessageTime(""+c);
					
				}else if(msj.getBytes().length == 8192) {
					long b1 = System.nanoTime();
					long rtt = b1 -a1;
					double resolve = (((8192+8192)/rtt)/1000.0);
					
					listener.onMessageTime("" + resolve);
					
				}else {
					listener.onMessage(msj);
				}
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void setList(OnMessageListener listener) {
		this.listener = listener;
	}
	
	public interface OnMessageListener{

		public void onMessage(String message);
		public void onMessageTime(String message);
		
	}


}
