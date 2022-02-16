package com.thread;

public class MyThread {

	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}
	private void start() {
		// TODO Auto-generated method stub
		
	}

}
