package com.java.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IsrANDOswDemo {
public static void main(String[] args) throws IOException {
	FileInputStream in=new FileInputStream("D:\\Stuffs\\doit.txt");
	InputStreamReader isr=new InputStreamReader(in,"gbk");//默认项目的编码
   FileOutputStream out=new FileOutputStream("D:\\Stuffs\\doitcopy.txt");
   OutputStreamWriter osr=new OutputStreamWriter(out, "gbk");
	int c;
while((c=isr.read())!=-1) {
	System.out.print((char)c);
	osr.write(c);
	osr.flush();
}
osr.close();
isr.close();
}
}
