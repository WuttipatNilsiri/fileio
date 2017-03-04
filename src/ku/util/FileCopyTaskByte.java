package ku.util;

import java.io.FileNotFoundException;

public class FileCopyTaskByte extends FileCopyTask{
	int byt = 1;
	/**
	 * initial task with set input and output file 
	 * @param infilename input file
	 * @param outfilename output file
	 * @throws FileNotFoundException if file not found
	 */
	public FileCopyTaskByte(String infilename,String outfilename) throws FileNotFoundException{
		super (infilename,outfilename);
	}
	/**
	 * initial task with set input output file and byte
	 * @param infilename input file
	 * @param outfilename output file
	 * @param byt byte per time that will copy
	 * @throws FileNotFoundException if file not found
	 */
	public FileCopyTaskByte(String infilename,String outfilename,int byt) throws FileNotFoundException{
		super (infilename,outfilename);
		this.byt = byt;
	}
	@Override
	/**
	 * run task
	 */
	public void run() {
		if(byt == 1){
			FileUtil.copy(in,out);
		}else if(byt > 1){
			FileUtil.copy(in,out,byt);
		}else
			System.out.println("ERROR");
		
	}
	
}
