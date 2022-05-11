package com.gd.day13;

//Create the thread in two way 
//By using extending the thread class
//By using the implement the Runnable interface
class MyRun implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			// TODO Auto-generated method stub
			System.out.println("Thread name " + i + " " + Thread.currentThread().getName());
		}

	}

}

public class MyRunnable {
	public static void main(String[] args) {

		MyRun r1=new MyRun();
		//object of thread and give the referance of Runnable Object 
		Thread t1=new Thread(r1);
		t1.setName("A");
		t1.setPriority(10);
		t1.start();
		
		
		Thread t2=new Thread(r1);
		t2.setName("B");
		t2.start();
		
	}
}
