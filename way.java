package new1;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
class MyThread extends Thread{
	private String name;
	public MyThread(String name) {
		this.name=name;
	}
	public void run() {
		for(int i=0;i<=120;i++) {
			System.out.println(this.name+"="+i);
		}
	}
}
class MeThread implements Runnable{
	private String x;
	public MeThread(String x) {
		this.x=x;
	}
	public void run() {
		for(int i=0;i<=120;i++) {
			System.out.println(this.x+"="+i);
		}
	}
}
class YouThread implements Callable<String>{
	private String y;
	public YouThread(String y) {
		this.y=y;
	}
	public String call() throws Exception{
		for(int i=0;i<=120;i++) {
			System.out.println(this.y+"="+i);
		}
		return "结束";
	}
}


public class way {
	public static void main(String args[])throws Exception{
		MyThread my=new MyThread("线程1");
		MeThread me=new MeThread("线程2");
		YouThread you=new YouThread("线程3");
		FutureTask<String>task=new FutureTask<String>(you);
		my.start();
		new Thread(me).start();
		new Thread(task).start();
		System.out.println("线程返回结果"+task.get());
	}

}
