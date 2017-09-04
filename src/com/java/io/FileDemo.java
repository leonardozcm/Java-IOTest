package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) {
	File file=new File("D:\\Stuffs\\try");
//File file2=new File("D:\\Stuffs\\九月三日.txt");
	File file2=new File("D:\\Stuffs","九月三日.txt");
if(!file2.exists()) {
	try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	
}
else
	file2.delete();
}
}
