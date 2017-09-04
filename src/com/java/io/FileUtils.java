package com.java.io;

import java.io.File;
import java.io.IOException;

//list most use of File
public class FileUtils {
/*
 * 列出目录下所有文件
 */
	public static void listDirectory(File dir)throws IOException
	{
		if(!dir.exists()) {
			throw new IllegalArgumentException("目录："+dir+"不存在。");
		}
		if(!dir.isDirectory()) {
			throw  new IllegalArgumentException(dir+"不是目录");
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
