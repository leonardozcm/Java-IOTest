package com.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
public static void main(String[] args) {
	File file=new File("D:\\Stuffs\\try");
//File file2=new File("D:\\Stuffs\\��������.txt");
	File file2=new File("D:\\Stuffs","��������.txt");
if(!file2.exists()) {
	try {
		file2.createNewFile();
	} catch (IOException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	
}
else
	file2.delete();
}
}
