package com;

/*public class DeadLockExample{
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
	}
	
	static class Thread1 extends Thread{
		public void run() {
			synchronized(lock1) {
				System.out.println("Thread 1 holding lock 1...");
				try {
					Thread1.sleep(10);
				}catch(InterruptedException e) {};
				System.out.println("Thread 1 waiting for lock 2...");
				synchronized(lock2) {
					System.out.println("Thread 1 holding lock 2...");
				}
			}
		}
	}
	
	static class Thread2 extends Thread{
		public void run() {
			synchronized(lock2) {
				System.out.println("Thread 2 holding lock 2...");
				try {
					Thread2.sleep(10);
				} catch(InterruptedException e) {};
				System.out.println("Thread 2 waiting for lock 1...");
				synchronized(lock1) {
					System.out.println("Thread 2 hoding lock 1...");
				}
			}
		}
		
	}
}*/

public class DeadLockExample{
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	
	static class Thread1 extends Thread{
		public void run() {
			synchronized (lock1) {
				System.out.println("thread1 holding lock1...");
				System.out.println("thread1 waiting for lock2...");
				synchronized(lock2) {
					System.out.println("thread1 holding both locks...");
				}
			}
		}
	}
	
	static class Thread2 extends Thread{
		public void run() {
			synchronized(lock2) {
				System.out.println("Thread2 holding lock2/...");
				System.out.println("thread2 waiting for lock1...");
				synchronized(lock1) {
					System.out.println("thread2 holding both locks...");
				}
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
	}
	
	
}