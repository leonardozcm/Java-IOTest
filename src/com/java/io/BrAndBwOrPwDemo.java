package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BrAndBwOrPwDemo {

	public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(
        		 new InputStreamReader(new FileInputStream("D:\\Stuffs\\doit3.txt"))
        		 );
         BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(
        		 new FileOutputStream("D:\\Stuffs\\doit4.txt")));
String line;
while((line=br.readLine())!=null) {
	System.out.print(line);
	bw.write(line);
	bw.newLine();
	bw.flush();
}
br.close();
bw.close();
	}

}
