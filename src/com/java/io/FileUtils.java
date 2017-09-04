package com.java.io;

import java.io.File;
import java.io.IOException;

//list most use of File
public class FileUtils {
/*
 * �г�Ŀ¼�������ļ�
 */
	public static void listDirectory(File dir)throws IOException
	{
		if(!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��"+dir+"�����ڡ�");
		}
		if(!dir.isDirectory()) {
			throw  new IllegalArgumentException(dir+"����Ŀ¼");
		}
		/*String[] flienames=dir.list();
		for(String filename:flienames) {
			System.out.println(dir+"\\"+filename);
		}*/
		File[] files=dir.listFiles();
		if(files!=null&&files.length>0) {
		for (File file : files) {
			if(file.isDirectory()) {
		listDirectory(file);
			}else {
				System.out.println(file);
			}
		}
		}
	}
}
