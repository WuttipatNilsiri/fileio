package ku.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class FileUtil {
	/**
	 * set in and out put then will copy 1 byte per time
	 * @param in InputStream
	 * @param out OutputStream
	 * @throws RuntimeException
	 */
	static void copy(InputStream in,OutputStream out) throws RuntimeException{
		try(InputStream ins = in){
			copy(ins,out,1);
			in.close();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException("error", e);	
		}
	}
	/**
	 * set in and out put then will copy x byte per time (x is blocksize)
	 * @param in InputStream
	 * @param out OutputStream
	 * @param blocksize byte per time that will copy
	 * @throws RuntimeException
	 */
	static void copy(InputStream in,OutputStream out, int blocksize) throws RuntimeException {
		try(InputStream ins = in){
			byte[] buffer = new byte[blocksize];
			while(ins.read(buffer) >= 0 ){
				out.write(buffer);
			}
			ins.close();
			out.close();
		}catch (IOException e) {
			throw new RuntimeException("error", e);
			
		}
	}
	/**
	 * set in and out put then will copy one line per time
	 * @param in InputStream
	 * @param out OutputStream
	 */
	public static void bcopy(InputStream in ,OutputStream out){
		try(InputStream ins = in){
			BufferedReader buffinput = new BufferedReader(new InputStreamReader(ins)); 
			PrintWriter prtout = new PrintWriter(out);
			String a = buffinput.readLine();
			while(a != null){
				prtout.println(a);
				
				a = buffinput.readLine();
			}
			in.close();
			prtout.close();
		}catch (IOException e) {
			throw new RuntimeException("error", e);
			
		}
	}
	
}
