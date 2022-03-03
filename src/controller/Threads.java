package controller;

public class Threads extends Thread {
	
	private int idThread;
	
	public Threads(int idThread) {
		this.idThread = idThread;
		
	}
	
	public void run() {
		System.out.println(idThread);
	}

}
