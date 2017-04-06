/*如何创建多线程：
	
	创建线程的方式：
	
		方式一：
			1. 自定义一个类继承Thread类。
			2. 重写Thread类的run方法 , 把自定义线程的任务代码写在run方法中
				疑问： 重写run方法的目的是什么？  
			   每个线程都有自己的任务代码，jvm创建的主线程的任务代码就是main方法中的所有代码, 自定义线程的任务代码就写在run方法中，自定义线程负责了run方法中代码。	
			3. 创建Thread的子类对象，并且调用start方法开启线程。
				
			注意：	一个线程一旦开启，那么线程就会执行run方法中的代码，run方法千万不能直接调用，直接调用run方法就相当调用了一个普通的方法而已
				并没有开启新的线程。
			
 */
public class Demo1 extends Thread {
	
	@Override  //把自定义线程的任务代码写在run方法中。
	public void run() {
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("自定义线程："+i);
		}
	}
	
	
	public static void main(String[] args) {
		//创建了自定义的线程对象。
		Demo1 d = new Demo1();
		//调用start方法启动线程
		d.start();
		
		for(int i  = 0 ; i < 100 ; i++){
			System.out.println("main线程："+i);
		}
	}

	
	
}
