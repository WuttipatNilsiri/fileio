package ku.util;

public class Stopwatch {
	/**
	 * 
	 */
	long startTime;
	long endTime;
	static final double NANOSEC = 1000.0*1000.0*1000.0;
	boolean isRunning = false;
	/**
	 * initial stopwatch
	 */
	public Stopwatch() {
		startTime = 0;
		endTime = 0;
		
	}
	/**
	 * start stopwatch by set start time
	 */
	public void start(){
		if(!isRunning)
			startTime = System.nanoTime();
			isRunning = true;
	}
	/**
	 * end stopwatch by set end time
	 */
	public void stop(){
		if(isRunning)
			endTime = System.nanoTime();
			isRunning = false;
	}
	/**
	 * 
	 * @return Elapsed time if watch is running it will use that current time to calculate
	 */
	public double getElapsed(){
		if(isRunning){
			return (System.nanoTime() - startTime)/NANOSEC;
		}else
			return (endTime - startTime)/NANOSEC;
		
		
	}
	
	
}
