package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.LinkedList;
import java.util.Queue;


//https://dzone.com/articles/the-evolution-of-producer-consumer-problem-in-java

/*
public class ProducerConsumerExecutorService {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable producerTask = () -> {
            try {
                int value = 0;
                while (true) {
                    blockingQueue.put(value);
                    System.out.println("Produced " + value);
                    value++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumerTask = () -> {
            try {
                while (true) {
                    int value = blockingQueue.take();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        executor.execute(producerTask);
        executor.execute(consumerTask);
        executor.shutdown();
    }
}
*/

/*
public class ProducerConsumer {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(2);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable producerTask = () -> {
            try {
                int value = 0;
                while (true) {
                    blockingQueue.put(value);
                    System.out.println("Produced " + value);
                    value++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable consumerTask = () -> {
            try {
                while (true) {
                    int value = blockingQueue.take();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        executor.execute(producerTask);
        executor.execute(consumerTask);
        executor.shutdown();
    }
}
 */


/*public class ProducerConsumer {
    static class Buffer {
        private Queue<Integer> list;
        private int size;
        public Buffer(int size) {
            this.list = new LinkedList<>();
            this.size = size;
        }
        public void add(int value) throws InterruptedException {
            synchronized (this) {
                while (list.size() >= size) {
                    wait();
                }
                list.add(value);
                notify();
            }
        }
        public int poll() throws InterruptedException {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                int value = list.poll();
                notify();
                return value;
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer(2);
        Thread producerThread = new Thread(() -> {
            try {
                int value = 0;
                while (true) {
                    buffer.add(value);
                    System.out.println("Produced " + value);
                    value ++;
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                while (true) {
                    int value = buffer.poll();
                    System.out.println("Consume " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();
    }
}*/

public class ProducerConsumer{
	static class Buffer{
		Queue<Integer> queue;
		int size;
		Buffer(int size){
			this.size=size;
			queue=new LinkedList();
		}
		public synchronized void add(int data) throws InterruptedException{
			while(queue.size()==size) {
				wait();
			}
			queue.add(data);
			notifyAll();
		}
		public synchronized int take() throws InterruptedException{
			while(queue.size()==0) {
				wait();
			}
			int temp = queue.poll();
			notifyAll();
			return temp;
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Buffer buffer = new Buffer(2);
		Thread produceThread = new Thread(()->{
			try {
				int data = 0;
				while(true) {
					Thread.sleep(1000);
					buffer.add(data);
					System.out.println("PRODUCE " + data);
					data++;
				}
			}
			catch(InterruptedException e) {};
		});
		Thread consumeThread = new Thread(()->{
			try {
				while(true) {
					Thread.sleep(1000);
					int temp = buffer.take();
					System.out.println("CONSUME " + temp);
				}
			}
			catch(InterruptedException e) {}
		});
		consumeThread.start();
		produceThread.start();
		consumeThread.join();
		produceThread.join();
	}
}






