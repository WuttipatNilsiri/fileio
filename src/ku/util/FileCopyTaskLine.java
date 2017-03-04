package ku.util;

import java.io.FileNotFoundException;

public class FileCopyTaskLine extends FileCopyTask{
	/**
	 * initial task with set input and output file 
	 * @param infilename input file
	 * @param outfilename output file
	 * @throws FileNotFoundException if file not found
	 */
	public FileCopyTaskLine(String infilename,String outfilename) throws FileNotFoundException{
		super (infilename,outfilename);
	}
	/**
	 * run task
	 */
	public void run() {
		FileUtil.bcopy(in,out);
	}
}
