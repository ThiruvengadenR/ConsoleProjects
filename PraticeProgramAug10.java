package file_io;

import java.io.*;
import java.util.Scanner;

public class PraticeProgramAug10 {
	
	public static void main(String[] args) throws IOException {
		File fi = new File("/home/gods/Desktop/fileio/newText.txt");
		System.out.println("write "+fi.canWrite());
		System.out.println("get"+fi.getAbsoluteFile());
		System.out.println("name "+fi.getName());
		System.out.println("read"+fi.canRead());
		fi.createNewFile();
		FileOutputStream fos = new FileOutputStream(fi);
			//fos.write(100);
//		fos.flush();
//		fos.close();
//				String name = "Thiruvengaden";
//				byte [] array = name.getBytes();
//				fos.write(array);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter you name ");
//		String name = sc.next();
//		byte [] array = name.getBytes();
//		fos.write(array);
		// we cannot get mutiple line of input like paragraph so we went to datainputStream .
		
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("Enter any paragraph you want ");
		//dis.read();
		//fos.write(dis.read());
//				int i = dis.read();
//				while(dis.read() != '*')
//				{
//					fos.write(dis.read());
//				}
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int i = dis.read();
		while(dis.read() != '*')
		{
			bos.write(dis.read());
		}
		fos.flush();
		fos.close();
		bos.close();
	}

}
