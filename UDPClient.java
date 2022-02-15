import java.io.*;
import java.net.*;

public class UDPClient{
	public static void main(String[] args) throws Exception{
		new Thread(new Runnable(){
			@Override
			public void run(){
				byte[] sendData = new byte[1024];
				sendData = args[0].getBytes();
				try{
					new DatagramSocket().send(
						new DatagramPacket(
						sendData, 
						sendData.length, 
						InetAddress.getByName("255.255.255.255"), 
						4210));
				}catch(Exception e){}
		}}).start();
	}
}