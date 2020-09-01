package app;

import comm.TCPConnection;

public class Application implements TCPConnection.OnMessageListener {

	private TCPConnection connection;
	
	public Application() {
		connection = new TCPConnection();
		connection.setList(this);
		connection.setPuerto(5000);
		connection.setEntrada("127.0.0.1");
	}
	
	public void init() {
		connection.start();
	}

	@Override
	public void onMessage(String message) {
		System.out.println("Este es el mensaje del usuario:" + message);
		
	}

	@Override
	public void onMessageTime(String message) {
		System.out.println("Este es el tiempo del servidor:" + message);
		
	}
	
}
