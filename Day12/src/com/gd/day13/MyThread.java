package com.gd.day13;

import javax.sql.rowset.spi.SyncFactory;

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

	// synchronized--it is keyword in java
	// it will put a lock and allow only one thread to enter into the code
	// MOniotr and lock

	// take the lock --there will one thread which will have the lock

	
	//synchronized--it is keyword
	//you can add this keyword to method
	//you can add this keyword block { }
	//use--it will make the code thread safe 
	
	
	//Thread safe  -only one thread at a time are allowed 
	              //to execute the code
	//Not Thread Safe  //mulithreaded enviroemnt 
	@Override
	 public void run() {

		//block
		synchronized (this) {

			for (int i = 0; i < 10; i++) {
				// TODO Auto-generated method stub
				System.out.println("Thread name " + i + " " + this.currentThread().getName());
			}
		}
		
		System.out.println("hello ");
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
