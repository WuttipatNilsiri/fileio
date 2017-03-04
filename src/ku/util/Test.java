package ku.util;



import java.io.FileNotFoundException;


public class Test {
	public static void main(String[]args) throws FileNotFoundException{
		timer.measureprt( new FileCopyTaskByte("New folder\\Big-Alice-in-Wonderland.txt","New folder\\test1b.txt") );
		timer.measureprt( new FileCopyTaskByte("New folder\\Big-Alice-in-Wonderland.txt","New folder\\test1kb.txt",1024) );
		timer.measureprt( new FileCopyTaskByte("New folder\\Big-Alice-in-Wonderland.txt","New folder\\test1kb.txt",4*1024) );
		timer.measureprt( new FileCopyTaskByte("New folder\\Big-Alice-in-Wonderland.txt","New folder\\test1kb.txt",64*1024) );
		timer.measureprt( new FileCopyTaskLine("New folder\\Big-Alice-in-Wonderland.txt","New folder\\testLine.txt") );
    
	}
	
}
