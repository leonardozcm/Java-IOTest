package com.java.io;

import java.io.File;
import java.io.IOException;

public class IOUtilTest2 {

	public static void main(String[] args) {
		File file=new File("D:\\Stuffs\\try");
		try {
			IOUtil.printHexByByteArray(file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
 