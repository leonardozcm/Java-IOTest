package com.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtil {
	/*
	 * 读取指定文件名，16进制输出到控制台
	 * 并且没输出10byte，换行
	 */
public static void printHex(String fileName)throws IOException {
	//把文件作为字节流，读操作
	FileInputStream in=new FileInputStream(fileName);
	int b;
	int i=1;
	while((b=in.read())!=-1) {
		if(b<=0xf) {
			System.out.print("0");
		}
		System.out.print(Integer.toHexString(b)+"  ");
		if(i++%10==0) {
			System.out.println();
		}
	}
	in.close();
}
public static void printHexByByteArray(String fileName)throws IOException {
	FileInputStream in=new FileInputStream(fileName);
	byte[] buf=new byte[20*1024];
	//从in中批量读取字节，放入buf这个字节数组中
	//返回的是读到的字节个数
	int  bytes=in.read(buf,0,buf.length);//一次性读完，说明足够大
	int j=0;
	for(int i=0;i<bytes;i++){
		if(buf[i]<=0xf) {
			System.out.print("0");
		}
		System.out.println(Integer.toHexString(buf[i])+"  ");
		if(j++%10==0) {
			System.out.println();
		}

	}
	in.close();
}
/**
 * 
 * @param srcFile 源文件
 * @param destFile 目标文件
 * @throws IOException
 */
public static void copyFile(File srcFile,File destFile)throws IOException{
	if(!srcFile.exists()) {
		throw new IllegalArgumentException("文件不存在");
	}
	if(!srcFile.isFile()) {
		throw new IllegalArgumentException("不是文件");
	}
	FileInputStream in=new FileInputStream(srcFile);
	FileOutputStream out=new FileOutputStream(destFile);
	byte[] buf=new byte[8*1024];
	int b;
	while((b=in.read(buf,0,buf.length))!=-1) {
		out.write(buf, 0, b);
		out.flush();
	}
	in.close();
	out.close();
 }

}
