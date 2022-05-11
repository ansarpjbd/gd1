package com.gd.day13;

//Process --it is task in operating system 

//Thread --Thread is small part of process 

//Chrome --One Process 
//chrome connects to internet 
//it load the websites
//it render the websites
//perform the action on websites 

//Life cycle of thread
//New State 
// start()  Runnable 
//Run()  Running
//Sleep , Wait (waiting)
//finish ...dead

class ThreadA extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			// TODO Auto-generated method stub
			System.out.println("Thread name " + i + " " + this.currentThread().getName());
		}
	}
	

}

public class MyThread {
	public static void main(String[] args) {

		ThreadA t1 = new ThreadA();
		t1.setName("t1");
		t1.start();

		ThreadA t2 = new ThreadA();
		t2.setName("t2");
		t2.start();

		
		ThreadA t3 = new ThreadA();
		t3.setName("t3");
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
	}
}
