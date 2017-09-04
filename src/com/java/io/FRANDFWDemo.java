package com.java.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRANDFWDemo {

	public static void main(String[] args)throws IOException {
	FileReader fr=new FileReader("D:\\Stuffs\\doit.txt");
FileWriter fw=new FileWriter("D:\\Stuffs\\doit3.txt");
int c;
String s1="¼û";
byte[] bs=s1.getBytes();
for (byte b : bs) {
	System.out.print(b);
}
System.out.println();
while(!((c=fr.read())==-1)) {
	fw.write(c);
	fw.flush();
}
fr.close();
fw.close();
	}

}
