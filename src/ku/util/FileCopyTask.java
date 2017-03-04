package ku.util;

import java.io.*;

public abstract class FileCopyTask implements Runnable{
	InputStream in;
	OutputStream out;
	/**
	 * initial task with out set anything
	 */
	public FileCopyTask(){
		
	}
	/**
	 * initial task with out set value
	 * @param infilename file input
	 * @param outfilename file output
	 * @throws FileNotFoundException if File not found
	 */
	public FileCopyTask(String infilename,String outfilename) throws FileNotFoundException{
		in = new FileInputStream(infilename);
		out= new FileOutputStream(outfilename);
	}
	/**
	 * set input file
	 * @param infilename input file
	 * @throws FileNotFoundException if File not found
	 */
	public void setInput(String infilename) throws FileNotFoundException{
		in = new FileInputStream(infilename);
	}
	/**
	 * set out input file
	 * @param outfilename output file
	 * @throws FileNotFoundException if file not found
	 */
	public void setOutput(String outfilename) throws FileNotFoundException{
		out = new FileOutputStream(outfilename);
	}
}
