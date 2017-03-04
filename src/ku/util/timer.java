package ku.util;

public class timer {
	static Runnable task;
	
	public static void measureprt(Runnable tasks){
		task = tasks;
		Stopwatch timer = new Stopwatch();
		timer.start();
		task.run();
		timer.stop();
		System.out.printf(task.toString() +" Elapsed time %.6f sec\n\n", timer.getElapsed());
	}
}
